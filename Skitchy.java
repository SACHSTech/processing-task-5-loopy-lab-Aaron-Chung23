import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1200, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(45, 150, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
    /*
    stroke(128);
    line(150, 25, 270, 350);  

    stroke(255);
    line(50, 125, 70, 50);  
*/
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

    
  }


  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * draws the bottom left section
   */
  public void draw_section1(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 3 + intRow*10; 
        intY = 300 + 3 + intColumn*10;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

  /**
   * Use the modulus operator and an if statement to select the color
   * Don't loop from 30 to 60 to shift everything over, just add 300 to x.
   */
  public void draw_section2(){
     int xTwo = 0;
    int yTwo = 0;

    for(int rowTwo = 0; rowTwo < 30; rowTwo++){
      for(int columnTwo = 0; columnTwo < 300; columnTwo++){
        
        xTwo = 300 + 3 + rowTwo*10;  
        yTwo = 300 + 3 + columnTwo*10; 

        if(rowTwo%2 ==0){
          fill(255);
          noStroke();
          rect(xTwo, yTwo, 5, 5);
        }
        
        if(rowTwo%2 !=0){
          fill(0);
          noStroke();
          rect(xTwo, yTwo, 5, 5);
        }
      }
    }

  }

  /**
   * Use the modulus operator and an if/else statement to select the color.
   * Don't use multiple 'if' statements.
   */
  public void draw_section3(){
    int xThree = 0;
    int yThree = 0;

    for(int rowThree = 0; rowThree < 30; rowThree++){
      for(int columnThree = 0; columnThree < 300; columnThree++){
        
        xThree = 600 + 3 + rowThree*10; 
        yThree = 300 + 3 + columnThree*10; 
        
      
        if(columnThree%2 ==0){
          fill(255);
          noStroke();
          rect(xThree, yThree, 5, 5);
        }
        
        else{
          fill(0);
          noStroke();
          rect(xThree, yThree, 5, 5);
        }
      }
    }

  }

  /**
   * Use the modulus operator and just one 'if' statement to select the color.
   */
  public void draw_section4(){
    int xFour = 0;
    int yFour = 0;

    for(int rowFour = 0; rowFour < 30; rowFour++){
      for(int columnFour = 0; columnFour < 300; columnFour++){
        
        xFour = 900 + 3 + rowFour*10; 
        yFour = 300 + 3 + columnFour*10; 
      
        if(rowFour%2 == 0 && columnFour != 0){
          fill(255);
          noStroke();
          rect(xFour, yFour, 5, 5);
        }
        
        else{
          fill(0);
          noStroke();
          rect(xFour, yFour, 5, 5);
        }
      }
    }

  }

  /**
   * Do NOT use 'if' statements to complete 5-8. Manipulate the loops instead
   */
  public void draw_section5(){
    int xFive = 0;
    int yFive = 0;
    int countFiveRow=0;

    for(int columnFive = 30; 0 < columnFive; columnFive--){
      for(int rowFive = 30; countFiveRow < rowFive; rowFive--){
        
        xFive = -7 + rowFive*10;  
        yFive = 3 + columnFive*10; 
        
      
        
        fill(255);
        noStroke();
        rect(xFive, yFive, 5, 5);


      }
      countFiveRow ++;
    }

  }

  public void draw_section6(){
    int xSix = 0;
    int ySix = 1;
    int countSixRow=30;
 

    for(int columnSix = 30; 0 < columnSix; columnSix--){
      for(int rowSix =0; rowSix < countSixRow; rowSix++){
        
        xSix =300 + 3 + rowSix*10; 
        ySix = -6 + columnSix*10;
        
      
        
        fill(255);
        noStroke();
        rect(xSix, ySix, 5, 5);


      }
      countSixRow --;
    }

  }

  public void draw_section7(){
    int xSeven = 0;
    int ySeven = 0;
    int rowCountSeven=30;
    int columnCountSeven=30;

    for(int columnSeven = 0; columnCountSeven > columnSeven; columnSeven++){
      for(int rowSeven = 0; rowCountSeven > rowSeven; rowSeven++){
        
        xSeven = 600 + 3 + rowSeven*10; 
        ySeven = 3 + columnSeven*10;
        
      
        
        fill(255);
        noStroke();
        rect(xSeven, ySeven, 5, 5);


      }
      rowCountSeven --;
    }

  }
  
  public void draw_section8(){
    int xEight = 0;
    int yEight = 0;
    int rowCountEight=0;

    for(int columnEight = 0; 30 > columnEight; columnEight++){
      for(int rowEight = 30; rowCountEight < rowEight; rowEight--){
        
        xEight = 900 + 3 + rowEight*10; 
        yEight = 3 + columnEight*10;
        
      
        
        fill(255);
        noStroke();
        rect(xEight, yEight, 5, 5);


      }
      rowCountEight ++;
  }

  }






}
