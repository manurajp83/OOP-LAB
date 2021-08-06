/* 3 Create interfaces Student and Sports. Create a class Result
implements Student and Sports. Display the academic and sports score
of a student*/

import java.util.Scanner;

interface Student 
{
  int score=20;
  void displayScore();
}

interface Sports
{
  int score=30;
  void displaySportScore();
}

class Result implements Student,Sports
{
 public void displayScore()
 {
   System.out.println("Academic score is :" +Student.score);
 }
 public void displaySportScore()
 {
   System.out.println("Sport score is :" +Sports.score);
 }
} 
class SportStudent
{
 public static void main(String args[])
 {
   Result r=new Result();
   r.displayScore();
   r.displaySportScore();
 }
}

/*OUTPUT
Academic score is :20
Sport score is :30
*/