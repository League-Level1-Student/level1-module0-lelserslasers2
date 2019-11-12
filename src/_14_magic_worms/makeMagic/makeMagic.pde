int counte = 0;

void setup(){
  size(600,600);
background(255, 255, 255);
}

void draw(){
  counte = counte + 1;
  makeMagical();
  if (counte < 300){
    fill(random(255), random(255), random(255));
    ellipse(getWormX(counte), getWormY(counte), 20,20);
  }
}

float frequency = .001;
float noiseInterval = PI;

void makeMagical() {
     fill( 0, 0, 0, 12 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}
