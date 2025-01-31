package com.arduino;
import gnu.io.CommPort;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import javafx.scene.control.Label;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;


public class Controller implements SerialPortEventListener {


    /**
     * Seial port
     */
    private String s;
    private Label label1;
    private SerialPort serialPort;
    private InputStream serialIn;
    private OutputStream serialOut;
    private BufferedReader serialReader;

    public void begin() throws Exception {
        // Open port
        CommPortIdentifier port = CommPortIdentifier.getPortIdentifier("/dev/ttyUSB0");
        CommPort commPort = port.open(this.getClass().getName(), 2000);
        serialPort = (SerialPort) commPort;
        serialPort.setSerialPortParams(9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
        serialIn = serialPort.getInputStream();
        serialOut = serialPort.getOutputStream();
        serialReader = new BufferedReader(new InputStreamReader(serialIn));
        serialPort.addEventListener(this);
        serialPort.notifyOnDataAvailable(true);

    }
    /**
     * Each info send by ARDUINO is taken here
     */

    public void serialEvent(SerialPortEvent e) {
        try {
            String line = serialReader.readLine();

            System.out.println(line);
            s=line;


        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public String serial()throws IOException{
        String a = serialReader.readLine();
        return "ce faci " + a ;
    }
