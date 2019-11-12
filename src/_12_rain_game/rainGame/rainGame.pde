int y = 0;
int x = (int) random(width);
int score = 0;

void setup(){
  size(650, 600);
  background(0, 200, 255);
}

void draw(){
  background(0, 200, 255);
  y = y + 2;
  if(y > 610){
    y = -10;
    x = (int)random(width);
  }
  else if (y == 540){
    checkCatch(x);
  }
  fill(0, 50, 255);
  stroke(0, 50, 255);
  ellipse(x, y, 30, 40);
  fill(10,10,10);
  rect(mouseX, 520, 60, 70); 
  fill(0, 0, 0);
  textSize(16);
  text("Score: " + score, 20, 20);
}

void checkCatch(int xVar){
     if (xVar > mouseX && x < mouseX+100){
          score++;
          y = 0;
          x = (int)random(width);
     }
     else if (score > 0){
          score--;
     println("Your score is now: " + score); }
}
