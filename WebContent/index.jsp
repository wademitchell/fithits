<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    	<style>
			  body {background-color:lightgray;}
			  h1   {color:blue;}
			  p    {color:darkblue;}
			  a    {text-decoration:none;color:#4d4d4d;}
		</style>
        <title>Fit Hits</title>
    </head>
    <body>
        <h1>Fit Hits</h1>
        <p>Enter the name of an Artist or Band you like and Fit Hits will play similar music for your workout.</p>
        <form action = "artist" method = "post">
            <label for = "artist">Artist:</label>
            <input type = "text" id = "artist" name = "artist"></input>
            <br />
            <br />
            <input type = "submit" value = "Submit"/>
            <br />
            <br />
        </form>
        
    </body>
    <footer>
    Powered by <a href="http://the.echonest.com">The Echo Nest</a> and <a href="http://spotify.com">Spotify</a>. © Fit Hits 2014
    </footer>
</html>