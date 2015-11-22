<!DOCTYPE html>
  <html>
    <head>
      <!--Import Google Icon Font-->
      <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
      <link href='https://fonts.googleapis.com/css?family=Comfortaa' rel='stylesheet' type='text/css'>
      
      <!--Import materialize.css-->
      <link type="text/css" rel="stylesheet" href="assest/css/materialize.min.css"  media="screen,projection"/>
      <link type="text/css" rel="stylesheet" href="assest/css/style.css"  media="screen,projection"/>
      <link type="text/css" rel="stylesheet" href="assest/css/bootstrap.min.css"  media="screen,projection"/>


      <!--Let browser know website is optimized for mobile-->
      <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    </head>

    <body background= "assest/img/bg4.jpg">
      <div class="container">
        <img src="assest/img/typo2.png" style="align: centre;" height="280px" id="san" >
        <div class="log">
          <a class="waves-effect waves-light btn-large bn black-text" id="myBtn"><i class="material-icons left">send</i>Login</a>
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <a class="waves-effect waves-light btn-large bn black-text" id="myBtn-su"><i class="material-icons left">send</i>sign up</a>
        </div>
      </div>

      <!-- Modal -->
  
    <div class="modal fade mo" style="width:40%;" id="myModal" role="dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header teal darken-2" style="padding:35px 50px;">
          <h2><i class="material-icons">lock</i>Login</h2>
        </div>
        <div class="modal-body" style="padding:40px 50px;">
            <form role="form" action="Auth">
            
            <div class="form-group">
              <label for="usrname" style="font-size:16px;"><i class="material-icons">perm_identity</i> Username</label>
              <input type="text" class="form-control" id="usrname" placeholder="Enter username">
            </div>
            <div class="form-group">
              <label for="psw" style="font-size:16px;"><i class="material-icons">vpn_key</i> Password</label>
              <input type="password" class="form-control" id="psw" placeholder="Enter password" >
            </div>

              <button type="submit" class="btn btn-success btn-block teal darken-2">Login</button>
          </form>
        </div>
        <div class="modal-footer" style="height:120%;">
          <button type="submit" class="btn btn-danger btn-default pull-left" data-dismiss="modal">Cancel</button>
          <p>Not a member? <a href="#">Sign Up</a></p>
          <p>Forgot <a href="#">Password?</a></p>
        </div>
      
      
    </div>
  </div> 
</div>


 <!-- Modal-2 -->
  
    <div class="modal fade mo" style="width:40%;" id="myModal-2" role="dialog">
    
      <!-- Modal-2 content-->
      <div class="modal-content">
        <div class="modal-header teal darken-2" style="padding:35px 50px;">
          <h2><i class="material-icons">assignment_ind</i>Sign Up</h2>
        </div>
        <div class="modal-body" style="padding:40px 50px;">
            <form role="form" action="signup">
            
            <div class="form-group">
              <lable for="email" style="font-size:16px;"><i class="material-icons">email</i> Email Id</label>
              <input type="text" class="form-control" id="usrname" placeholder="Enter email" name="email">
            </div>
            <div class="form-group">
              <label for="usrname" style="font-size:16px;"><i class="material-icons">perm_identity</i> Username</label>
              <input type="text" class="form-control" id="usrname" placeholder="Enter username" name="username">
            </div>
            <div class="form-group">
              <label for="psw" style="font-size:16px;"><i class="material-icons">vpn_key</i> Password</label>
              <input type="password" class="form-control" id="psw" placeholder="Enter password" name="password">
            </div>
            <div class="form-group">
              <label for="psw" style="font-size:16px;"><i class="material-icons">vpn_key</i> Re-enter Password</label>
              <input type="password" class="form-control" id="psw" placeholder="Re-Enter password" name="repassword">
            </div>
           
              <button type="submit" class="btn btn-success btn-block teal darken-2">Sign Up</button>
          </form>
        </div>
        <div class="modal-footer" style="height:120%;">
          <button type="submit" class="btn btn-danger btn-default pull-left" data-dismiss="modal">Cancel</button>
        </div>
      
      
    </div>
  </div> 
</div>

      <!--Import jQuery before materialize.js-->
      <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
      <script type="text/javascript" src="assest/js/materialize.min.js"></script>
      <script type="text/javascript" src="assest/js/bootstrap.min.js"></script>
      <script>
        $(document).ready(function(){
            $("#myBtn").click(function(){
                $("#myModal").modal();
            });
          });
      </script>
      <script>
        $(document).ready(function(){
            $("#myBtn-su").click(function(){
                $("#myModal-2").modal();
            });
          });
      </script>

    </body>
  </html>