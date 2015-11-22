<!DOCTYPE html>
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

    <body background="assest/img/tem-bg.jpg">
      <nav id="trans">
        <div class="nav-wrapper">
          <a href="#" class="brand-logo">Logo</a>
            <ul id="nav-mobile" class="right hide-on-med-and-down icons">
              <li><a href="home.jsp" class="black-text lt">Home</a></li>
              <li><a href="templates.jsp" class="black-text lt">Themes</a></li>
              <li><a href="#" class="black-text lt">Admin</a></li>
            </ul>
        </div>
      </nav>

      
      
      

      <div class="row">
      <div class="col s6 offset-s7">
        <h1>Themes</h1>
          <div id="slider1_container">
            <!-- Slides Container -->
            <div u="slides" style="cursor: move; position: absolute; overflow: hidden; left: 630px; top: 150px; width: 600px; height: 300px;">
              <div class="card" style="width:500px; length:200px;">
                <div class="card-image">
                  <a href="temp1/index.html"><img src="assest/img/pic.png"></a>
                </div>
                <div class="card-content">
                  <p>I am a very simple card. I am good at containing small bits of information.
                  I am convenient because I require little markup to use effectively.</p>
                </div>
              </div>
              <div class="card" style="width:500px; length:200px;">
                <div class="card-image">
                  <a href="temp2/index.html"><img src="assest/img/pic2.jpg"></a>
                </div>
                <div class="card-content">
                  <p>I am a very simple card. I am good at containing small bits of information.
                  I am convenient because I require little markup to use effectively.</p>
                </div>
              </div>
              <div class="card" style="width:500px; length:200px;">
                <div class="card-image">
                  <a href="temp3/index.html"><img src="assest/img/pic3.jpg"></a>
                </div>
                <div class="card-content">
                  <p>I am a very simple card. I am good at containing small bits of information.
                  I am convenient because I require little markup to use effectively.</p>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      



      
      <!--Import jQuery before materialize.js-->
      <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
      <script type="text/javascript" src="assest/js/materialize.min.js"></script>
      <script type="text/javascript" src="assest/js/bootstrap.min.js"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/jssor-slider/19.0.1/jssor.slider.mini.js"></script>


      <!-- it works the same with all jquery version from 1.x to 2.x -->
      <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.0.0-alpha1/jquery.min.js"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/jssor-slider/19.0.1/jssor.slider.mini.js"></script>
      <script>
          jQuery(document).ready(function ($) {
              var options = { $AutoPlay: true };
              var jssor_slider1 = new $JssorSlider$('slider1_container', options);
          });
      </script>

    </body>
  </html>