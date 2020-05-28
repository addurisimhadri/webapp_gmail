<!DOCTYPE html>
<html>

<head>
  <title>Google Auth Demo</title>
  <script src="https://apis.google.com/js/api.js?onload=onLibraryLoaded" async defer></script>
</head>
<body>

  <h1>Welcome to the Demo</h1>
  <div id="button3">Sign in with render function</div>
  <button id="signout" onclick="signOut()">Sign out</button>
  <div id="name"></div>
  <script>
    var auth2 = undefined;
    function onLibraryLoaded() {
      gapi.load('auth2', function() {
        auth2 = gapi.auth2.init({
          client_id: '813437293938-b4qhe3s96n8g415cl7eqo0cm99oo6qlc.apps.googleusercontent.com',
          scope: 'profile'
        })

        // when page first loads, user is not signed in
        console.log('user is signed in: ', isUserSignedIn());

        // Method 2: sign in handler hooked up by the library
        console.log('click handler');
         console.log("<%=request.getQueryString()%>");
         
      // listen for changes in user or signIn status
         auth2.isSignedIn.listen(function(isSignedIn) {
           console.log('change in sign in status ', isSignedIn)
           if(isSignedIn) {
             showCurrentUserInfo();
           }
           
         })
      })

       
        
      gapi.load('signin2', function() {
        // Method 3: render a sign in button
        // using this method will show Signed In if the user is already signed in
        var opts = {
          width: 200,
          height: 50,
          onSuccess: function(googleUser) {
            console.log('signin2 success')
            document.querySelector('#name').innerText = JSON.stringify(googleUser);
          }
        }
        gapi.signin2.render('button3', opts)
      })
    }

    // Method 1: sign in handler hooked up yourself  
    function onSignInClicked() {
      // using global variable
      auth2.signIn().then(function(result) {
        console.log('sign in successful')
        document.querySelector('#name').innerText = JSON.stringify(result)
      }, function(err) {
        console.log('this is an error')
      })
    }

    function isUserSignedIn() {
      // user is signed in if you click the button since the lib has been loaded already
      var isSignedIn = auth2.isSignedIn.get();
      document.querySelector('#name').innerText = isSignedIn;
      return isSignedIn
    }

    // get the current users info
    function showCurrentUserInfo() {
      var googleUser = auth2.currentUser.get();
      console.log(googleUser.Tt.Du); 
      console.log(document.URL+"?<%=request.getQueryString()%>&email="+googleUser.Tt.Du+"&name="+googleUser.Tt.Bd);
      document.querySelector('#name').innerText = JSON.stringify(googleUser);
     window.location.href = "/gmailsignin/success.jsp?<%=request.getQueryString()%>&email="+googleUser.Tt.Du+"&name="+googleUser.Tt.Bd;
    }

    function signOut() {
      auth2.signOut().then(function() {
        console.log('user signed out')
        document.querySelector('#name').innerText = 'user signed out'
      })
    }
  
    
  </script>
</body>
</html>