/**
 * 
 *
 * 29290473
 * K.Q Tawa
 */
import java.util.Random;
import java.util.Scanner;

public class SnakeGame
{
   //Grid size
   private final int rows = 10;
   private final int colums = 10;
   private MyArrayListHM<int[]> snake;
   private int[] food;
   private String direction;
   private int score;
   private boolean gameOver;
   private Random random;
   private Scanner playerInput;

   public SnakeGame()
   {
      snake = new MyArrayListHM<int[]>();
      random = new Random();
      playerInput = new Scanner(System.in);
      score = 0;
      direction = "W"; 
      gameOver = false;
   }

   public void startGame()
   {
      initializeSnake();
      placeFood();

      while(!gameOver)
      {
         displayGrid();
         System.out.println("Score: " + score);
         System.out.print("Enter direction (W:Up,S:Down,A:left,D:right): ");
         String dirction = playerInput.nextLine().toUpperCase();

        
         if(dirction.equals("W") || dirction.equals("A") || dirction.equals("S") || dirction.equals("D"))
         {
            direction = dirction;
         }

         moveSnake();
      }

      System.out.println("Game Over! ,Last Length: " + snake.getSize() + ", Score: " + score);
      System.out.print("Play again? (Yes/No): ");
      String ansr = playerInput.nextLine().toUpperCase();
      if(ansr.equals("Yes"))
      {
         score = 0;
         snake.clear();
         startGame();
      }
   }

   private void initializeSnake()
   {
      int startRow = 5;
      int startCol = 5;
      snake.add(0, new int[]{startRow, startCol});
   }

   private void placeFood()
   {
      int r;
      int c;
      do
      {
         r = random.nextInt(rows);
         c = random.nextInt(colums);
      } while(snakeContains(r, c)); 
      food = new int[]{r, c};
   }

   
   private boolean snakeContains(int r, int c)
   {
      for(int i = 0; i < snake.getSize(); i++)
      {
         int[] bodyPart = snake.get(i);
         if(bodyPart[0] == r && bodyPart[1] == c)
            return true;
      }
      return false;
   }

   private void moveSnake()
   {
      int[] head = snake.get(0);
      int newRow = head[0];
      int newColum = head[1];

    
      if(direction.equals("W"))
         newRow--;
      else if(direction.equals("S"))
         newRow++;
      else if(direction.equals("A"))
         newColum--;
      else if(direction.equals("D"))
         newColum++;

      
      if(newRow < 0)
         newRow = rows - 1;
      else if(newRow >= rows)
         newRow = 0;
      if(newColum < 0)
         newColum = colums - 1;
      else if(newColum >= colums)
         newColum = 0;

      // Collision check
      if(snakeContains(newRow, newColum))
      {
         gameOver = true;
         return;
      }

      
      MyArrayListHM<int[]> newSnake = new MyArrayListHM<int[]>();
      newSnake.add(0, new int[]{newRow, newColum});
      for(int i = 0; i < snake.getSize(); i++)
      {
         newSnake.add(i + 1, snake.get(i));
      }
      snake = newSnake;

      
      if(newRow == food[0] && newColum == food[1])
      {
         score++;
         placeFood();
      }
      else
      {
         
         snake.remove(snake.getSize() - 1);
      }
   }

   private void displayGrid()
   {
      for(int r = 0; r < rows; r++)
      {
         for(int c = 0; c < colums; c++)
         {
            if(r == food[0] && c == food[1])
            {
               System.out.print("* ");
            }
            else
            {
               boolean isSnake = false;
               
               for(int i = 0; i < snake.getSize(); i++)
               {
                  int[] bodyPart = snake.get(i);
                  if(bodyPart[0] == r && bodyPart[1] == c)
                  {
                     if(i == 0)
                        System.out.print("H ");
                     else
                        System.out.print("b ");
                     isSnake = true;
                     break;
                  }
               }
               if(!isSnake)
               {
                  System.out.print(". ");
               }
            }
         }
         System.out.println();
      }
   }
}
