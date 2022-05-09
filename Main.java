class Main 
{
  public static void main(String[] args) 
  {
    SeatingChart roshChodesh = new SeatingChart();
    roshChodesh.addStudent("ArielaBenEliyahu ", 0, 0);
    roshChodesh.addStudent("BeilaBeron ", 0, 1);
    roshChodesh.addStudent("MiriamBloom ", 0, 2);
    roshChodesh.addStudent("RainaBoldt ", 0, 3);
    roshChodesh.addStudent("ShainaCohen ", 1, 0);
    roshChodesh.addStudent("ShiraDardashty ", 1, 1);
    roshChodesh.addStudent("RachelDayan ", 1, 2);
    roshChodesh.addStudent("TaliaGhanem ", 1, 3);
    roshChodesh.addStudent("EsteeHami ", 2, 0);
    roshChodesh.addStudent("BasyaKessell ", 2, 1);
    roshChodesh.addStudent("MoriyaMataraso ", 2, 2);
    roshChodesh.addStudent("AlizaMeyer ", 2, 3);
    roshChodesh.addStudent("AriellaMieli ", 3, 0);
    roshChodesh.addStudent("BrachaShirken ", 3, 1);
    roshChodesh.printChart();
    roshChodesh.swapStudents("ShiraDardashty ", 2, 1);
    roshChodesh.swapStudents("BrachaShirken ", 3, 3);
    roshChodesh.printChart();
  }
}

