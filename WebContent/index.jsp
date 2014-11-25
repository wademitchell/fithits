<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    	<style>
			  body {background-color:lightgrey}
			  #wrapper {
				  max-width: 768px;
				  margin: 10% auto;
				  padding; 10% 20%;
				  background: lightgrey
			}
		</style>
        <title>Fit Hits</title>
    </head>
    <body>
    	<div id = "wrapper">
        <h1>Fit Hits</h1>
        <p>Enter the name of an Artist or Band you like and Fit Hits will play similar music for your workout.</p>
        <form action = "artist" method = "post">
            <label for = "artist">Artist:</label>
            <input type = "text" id = "artist" name = "artist" size = 40></input>
            <br />
            <br />
            <input type = "submit" value = "Submit"/>
            <br />
            <br />
        </form>
        
    </body>
    <footer>
    Powered by <a href="http://the.echonest.com">The Echo Nest</a> and <a href="http://spotify.com">Spotify</a>. © Fit Hits 2014
    </div>
    </footer>
</html>