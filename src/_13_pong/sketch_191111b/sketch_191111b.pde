int x = 0;
int y = 300;
boolean back = false;
boolean backY = false;
boolean pleaseWork = true;
void setup(){
   size(600,600);
   background(0,0,0);
}
 
void draw(){
  background(0,0,0);
  if (x == 0){
  back = false;
  }
  else if (x == width){
    back = true;
  }
  if (back){
    x = x - 5;
  }
  else{
    x = x + 5;
  }
  
  if (y == 0){
  backY = false;
  pleaseWork = true;
  }
  else if (y == height){
    backY = true;
  }
  
  backY = intersects(x,y,mouseX,550,75);
  
  if (backY){
    y = y - 5;
  }
  else{
    y = y + 5;
  }
  
  fill(255,255,255);
  ellipse(x, y, 50, 50);
  rect(mouseX, 550, 75, 20);
}

boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength){
          pleaseWork = false;
          return true;
     }
     else if (pleaseWork){
          return false;
     }
     else{
       return true;
     }
}
