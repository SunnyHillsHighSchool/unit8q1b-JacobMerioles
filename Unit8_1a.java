//Programmer: Jacob Merioles
public class Unit8_1a
{
  public int [] [] modifyRows (int [] [] array)
 { 
  int[][] newArray = new int[array.length][array[0].length];
  for (int row = 0; row < newArray.length; row += 2)
    for (int col = 0; col < newArray[0].length; col++)
      newArray[row][col] = array[row][col];
            
  for (int row = 1; row < newArray.length; row += 2)
    for (int col = 0; col < newArray[row].length; col++)
      newArray[row][col] = array[row-1][col];
  return newArray;
  }
}
 