class SeatingChart
{
  Student[][] stArray = new Student[5][4];
  int row, column;

  public void addStudent(String studentName, int row, int column)
  {
    Student newStudent = new Student(studentName);
    stArray[row][column] = newStudent;
  }

  public void swapStudents(String studentName, int newRow, int newColumn)
  {
    int origRow = 0;
    int origColumn = 0;
    boolean studentExists = false;

    for(int row = 0; row < stArray.length; row++)
    {
      for(int column = 0; column < stArray[row].length; column++)
      {
        if(stArray[row][column] != null && stArray[row][column].getStudentName().equals(studentName))
        {
          studentExists = true;
          origRow = row;
          origColumn = column;
        }
      }
    }

    if(studentExists == true)
      {
        Student switchStudent = new Student(studentName);
        switchStudent = stArray[origRow][origColumn];
        stArray[origRow][origColumn] = stArray[newRow][newColumn];
        stArray[newRow][newColumn] = switchStudent;
      }
      else
        System.out.println("Student does not exist.");
  }

   public void printChart()
   {
     System.out.println("********** Tenth Grade Seats **********");
     for(int row = 0; row < stArray.length; row++)
     {
       for(int column = 0; column < stArray[row].length; column++)
       {
         if(stArray[row][column] == null)
         {
           System.out.print(" *empty* ");
         }
         else
         {
           System.out.print(stArray[row][column].getStudentName());
         }
       }
       System.out.println();
     }
     System.out.println();
   }
}