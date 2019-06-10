<html>
<head>
    <link href="https://fonts.googleapis.com/css?family=Ruge+Boogie&display=swap" rel="stylesheet">
    <title>Login
    </title>
    <style>
        .input{
            font-size: 0.5cm;
            margin-left: 25px;
            border-radius: 300px;
        }
        .text{
            font-family: 'Ruge Boogie', cursive;
            font-size:2cm;
            color: #FBF5C2;
        }
        .submit1{
            margin-left: 215px;
            border-radius: 300px;
        }
        body{
            background: #4C003C;
        }
        h2{
            color: black;
            text-shadow: 1px 0 azure, 0 2px azure;
            margin-left: 30%;
            font-family: 'Ruge Boogie', cursive;
            font-size: 3cm;
        }
        table{
            margin-top: 10%;
            margin-left: 30%;
        }


    </style>
</head>
<body>
    <div>
        <form action="login" method="post">
            <h2>Welcome to Home</h2>
            <table>
            <tr>
                <td class="text">Introdu nume</td>
                <td><input class="input" type="text" name="user"></td>
            </tr>
            <tr>
                <td class="text">Password</td>
                <td><input class="input" type="password" name="password"></td>
            </tr>
            <tr>
                <td>
                <td>
                    <input class="submit1" type="submit" name="submit">
                </td>
                </td>
            </tr>
        </table>

    </form>
</div>
</body>
</html>
