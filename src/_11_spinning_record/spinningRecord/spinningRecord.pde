
PImage pictureOfRecord;
int rotations = 0;
import ddf.minim.*;             //at the very top of your sketch
Minim minim;        //as a member variable
AudioPlayer song;      //as a member variable

void setup(){
  minim = new Minim(this);    //in the setup method
  song = minim.loadFile("awsomeTrack.mp3", 512);   //in the setup method
  size(600,600);                                 //in setup method
  pictureOfRecord= loadImage("pictureOfRecord.jpeg");      //in setup method
  pictureOfRecord.resize(height,width);     //in setup method
}

void rotateImage(PImage image, int amountToRotate) {
  translate(width/2, height/2);
  rotate(amountToRotate*TWO_PI/360);
  translate(-image.width/2, -image.height/2);
}

void draw(){
  if (mousePressed){
    rotations = rotations + 181;
    song.play();
  }
  else{
    song.pause();
  }
  rotateImage(pictureOfRecord, rotations);
  image(pictureOfRecord, 0,0);  //in draw method
}
