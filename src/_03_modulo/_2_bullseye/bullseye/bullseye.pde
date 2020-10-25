
void setup() {

  // set the size of your sketch
  size(300, 300);

  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for (int num=220; num>=0; num-=45) {
    
    //Use an if statement and modulo to alternate the color of your rings.
    if (num % 2 == 0) {
    fill(#8DD9ED);  
    }
    else {
      fill(#C47FFC);
  }
  ellipse(150, 150, num, num);
  
} }
