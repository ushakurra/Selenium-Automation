package SeleniumTraining;

import org.testng.annotations.Test;
import com.automation.utility.ExcelDataProvider;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.IFactoryAnnotation;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
public class DSAlgo {

   WebDriver driver;
    @Test
    public void f() throws InterruptedException {
  	  
  	  driver.findElement(By.xpath("//button[contains(text(),'Get Started')]")).click();
  	  Thread.sleep(3000);
  	  
  	  ExcelDataProvider provider = new ExcelDataProvider();
  	  String[][] data = provider.getData();
  	  int rowLength = data[0].length;

  	  
  	 for (int i=0; i<= rowLength; i++)  				 
  		  {   
  		 
  		 System.out.println("row length is " +  rowLength);
  		 System.out.println("i value" +  i);
  			
  	  
  	  driver.findElement(By.linkText("Sign in")).click();
  	  Thread.sleep(3000);
  	  
  	  driver.findElement(By.xpath("//input[@id='id_username']")).sendKeys(data[i][0]);
  	  Thread.sleep(1000);
  	  
  	  driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys(data[i][1]);
  	  Thread.sleep(1000);
  	  
  	  driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/form[1]/input[4]")).click();
  	  Thread.sleep(3000);
  	  
  	 if(driver.getPageSource().contains("Invalid Username")) {
  		 
  		 System.out.println("Invalid Credentials");
  		
  			 
  	 }
  	 else {
  		 System.out.println("valid Credentials");  		 
  		   
  		//Clicking on Get Started for Data Structures Introduction  
  		  driver.findElement(By.linkText("Get Started")).click();
  		  Thread.sleep(3000);
  		  
  		//Scroll Down to see more links on Data Structures Introduction page
  			 JavascriptExecutor js1 = (JavascriptExecutor) driver;
  			 js1.executeScript("window.scrollBy(0,750)", "");
  			 Thread.sleep(3000);
  		  
  		  //click on 'Time Complexity' under Data Structures Introduction
  		  driver.findElement(By.xpath("//a[contains(text(),'Time Complexity')]")).click();
  		  Thread.sleep(3000);
  		  
  		//Scroll Down to see more on Data Structures Introduction page
  			 JavascriptExecutor js2 = (JavascriptExecutor) driver;
  			 js2.executeScript("window.scrollBy(0,1200)", "");
  			 Thread.sleep(3000);
  		  
  		//click on 'Try Here' button under Time Complexity in Data Structures Introduction 
  		 driver.findElement(By.xpath("//a[contains(text(),'Try here>>>')]")).click();
  		  Thread.sleep(3000);
  		  
  		 driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("x=[1,2,3,4]\n"
  		 		+ "x.insert(3,5)\n"
  		 		+ "print(O(x))");
  		 Thread.sleep(3000);
  		 driver.findElement(By.xpath("//*[@id=\"answer_form\"]/button")).click();
  		 Thread.sleep(3000);
  		 driver.switchTo().alert().accept();
  		 Thread.sleep(3000);
  		 driver.switchTo().activeElement();
  		 Thread.sleep(3000);
  		 
  		  
  		 //Going back to the Time Complexity page as we dont have navigation form 'Try here' Editor
  		  driver.get("https://dsportalapp.herokuapp.com/data-structures-introduction/time-complexity/");
  		  Thread.sleep(3000);
  		  
  		//click on 'Practice Questions' link under Data Structures Introduction 
  		  driver.findElement(By.xpath("//a[contains(text(),'Practice Questions')]")).click();
  		  Thread.sleep(4000);
  		  
  		//Going back to the Home page as we dont have navigation links from practice Questions Page  
  		  driver.get("https://dsportalapp.herokuapp.com/home");
  		 Thread.sleep(3000);
  		 
  		 //click on 'Get Started button for Quees
  		 driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/a")).click();
  		 Thread.sleep(3000);
  		 
  		 //Scroll Down to see more links on Queue page
  		 JavascriptExecutor js3 = (JavascriptExecutor) driver;
  		 js3.executeScript("window.scrollBy(0,750)", "");
  		 Thread.sleep(3000);
  		 
  		 //clcik on "Implementation of Queue in Python" link under Queue
  		 driver.findElement(By.linkText("Implementation of Queue in Python")).click();
  		 Thread.sleep(3000);
  		 
  		//clcik on "Try Here" button under "Implementation of Queue in Python" link under Queue
  		 driver.findElement(By.linkText("Try here>>>")).click();
  		 Thread.sleep(3000);
  		 
  		 driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("queue = []\n"
  		 		+ "queue.append('a')\n"
  		 		+ "print(queue)");
  			 Thread.sleep(3000);
  			 driver.findElement(By.xpath("//*[@id=\"answer_form\"]/button")).click();
  			 Thread.sleep(3000);

  		 //go back to 'Queue' Page
  		 driver.get("https://dsportalapp.herokuapp.com/queue/");
  		 Thread.sleep(3000);
  			
  		 //Scroll Down to see more links on Queue page
  		 JavascriptExecutor js5 = (JavascriptExecutor) driver;
  		 js5.executeScript("window.scrollBy(0,1200)", "");
  		 Thread.sleep(3000);
  		 	 
  		//click on "Implementation using collections.deque" under Queue Page
  		driver.findElement(By.linkText("Implementation using collections.deque")).click();
  		Thread.sleep(3000);
  			 
  		//clcik on "Try Here" button under "Implementation using collections.deque" link under Queue
  		driver.findElement(By.linkText("Try here>>>")).click();
  		Thread.sleep(3000);
  		
  		driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("queue = []\n"
  				+ "queue.append('a')\n"
  				+ "queue.append('b')\n"
  				+ "print(queue.pop(0))\n"
  				+ "print(queue)");
  			 Thread.sleep(3000);
  			 driver.findElement(By.xpath("//*[@id=\"answer_form\"]/button")).click();
  			 Thread.sleep(3000);
  			 
  		//go back to 'Queue' Page
  		driver.get("https://dsportalapp.herokuapp.com/queue/");
  		Thread.sleep(3000);
  				
  		//Scroll Down to see more links on Queue page
  		JavascriptExecutor js5a = (JavascriptExecutor) driver;
  		js5.executeScript("window.scrollBy(0,1200)", "");
  		Thread.sleep(3000);
  		 
  		 //click on "Implementation using array" under Queue Page
  		 driver.findElement(By.linkText("Implementation using array")).click();
  		 Thread.sleep(3000);
  		 
  		//Scroll Down to see more links on Queue page
  			 JavascriptExecutor js6 = (JavascriptExecutor) driver;
  			 js6.executeScript("window.scrollBy(0,750)", "");
  			 Thread.sleep(3000);
  		 
  		//clcik on "Try Here" button under "Implementation using array" link under Queue
  			 driver.findElement(By.linkText("Try here>>>")).click();
  			 Thread.sleep(3000);
  			 
  			 driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("q=[]\n"
  			 		+ "def Enqueue():\n"
  			 		+ "    if len(q)==size:\n"
  			 		+ "        print(\"Queue is Full!!!!\")");
  					 Thread.sleep(3000);
  					 driver.findElement(By.xpath("//*[@id=\"answer_form\"]/button")).click();
  					 Thread.sleep(3000);
  			 
  			//go back to 'Queue' Page
  			 driver.get("https://dsportalapp.herokuapp.com/queue/");
  			 Thread.sleep(3000);
  			 
  			 //Scroll Down to see more links on Queue page
  			 JavascriptExecutor js7 = (JavascriptExecutor) driver;
  			 js7.executeScript("window.scrollBy(0,1200)", "");
  			 Thread.sleep(3000);
  			 
  			 //click on "Queue Operations" under Queue Page
  			 driver.findElement(By.linkText("Queue Operations")).click();
  			 Thread.sleep(3000);
  			 
  			//clcik on "Try Here" button under "Implementation using array" link under Queue
  			driver.findElement(By.linkText("Try here>>>")).click();
  			Thread.sleep(3000);
  			
  			driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("print(\"queue is full\")");
  			Thread.sleep(3000);
  			driver.findElement(By.xpath("//*[@id=\"answer_form\"]/button")).click();
  			Thread.sleep(3000);
  				
  			//go back to 'Queue' Page
  			 driver.get("https://dsportalapp.herokuapp.com/queue/implementation-lists/");
  			 Thread.sleep(3000);
  				 
  			//click on " Practice Questions" under Queue Page
  			 driver.findElement(By.linkText("Practice Questions")).click();
  			 Thread.sleep(3000);
  			 
  			 // Go back to home page
  			 driver.get("https://dsportalapp.herokuapp.com/home");
  			 Thread.sleep(3000);
  			 
  			 //click on Tree Data Structure
  			 
  			 driver.findElement(By.xpath("//body/div[2]/div[6]/div[1]/div[1]/a[1]")).click();
  			 Thread.sleep(3000);		 
  			  
  			//click on "Overview of Trees" under Tree Page
  			 driver.findElement(By.linkText("Overview of Trees")).click();
  			 Thread.sleep(3000);
  			 
  			//click on "Try Here" button under "Overview of Trees" link under Trees
  			 driver.findElement(By.linkText("Try here>>>")).click();
  			 Thread.sleep(3000);
  			 
  			 driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("class Node:\n"
  			 		+ "   def __init__(self, data):\n"
  			 		+ "      self.left = None\n"
  			 		+ "      self.right = None\n"
  			 		+ "      self.data = data\n"
  			 		+ "   def PrintTree(self):\n"
  			 		+ "      print(self.data)\n"
  			 		+ "\n"
  			 		+ "root = Node(10)\n"
  			 		+ "root.PrintTree()");
  				 Thread.sleep(3000);
  				 driver.findElement(By.xpath("//*[@id=\"answer_form\"]/button")).click();
  				 Thread.sleep(3000);
  				 driver.switchTo().alert().accept();
  				 Thread.sleep(3000);
  				 driver.switchTo().defaultContent();
  				 Thread.sleep(3000);
  			 
  			 
  			//go back to 'Tree' page
  			 driver.get("https://dsportalapp.herokuapp.com/tree/");
  			 Thread.sleep(3000);
  			 
  			//click on "Terminologies" under Tree Page
  			 driver.findElement(By.linkText("Terminologies")).click();
  			 Thread.sleep(3000);
  			 
  			//click on "Try Here" button under "Terminologies" link under Trees
  			 driver.findElement(By.linkText("Try here>>>")).click();
  			 Thread.sleep(3000);
  			 
  			 driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("class BinaryTreeNode:\n"
  			 		+ "  def __init__(self, data):\n"
  			 		+ "    self.data = data\n"
  			 		+ "    self.leftChild = None\n"
  			 		+ "    self.rightChild=None\n"
  			 		+ " print(BinaryTreeNode)");
  				 Thread.sleep(3000);
  				 driver.findElement(By.xpath("//*[@id=\"answer_form\"]/button")).click();
  				 Thread.sleep(3000);
  				 driver.switchTo().alert().accept();
  				 Thread.sleep(3000);
  				 driver.switchTo().defaultContent();
  				 Thread.sleep(3000);
  			 
  			//go back to 'Tree' page 
  			 driver.get("https://dsportalapp.herokuapp.com/tree/");
  			 Thread.sleep(3000);
  			 
  			//click on "Types of Trees" under Tree Page
  			 driver.findElement(By.linkText("Types of Trees")).click();
  			 Thread.sleep(3000);
  			 
  			//Scroll Down to see more links on Tree page
  			 JavascriptExecutor js8 = (JavascriptExecutor) driver;
  			 js8.executeScript("window.scrollBy(0,750)", "");
  			 Thread.sleep(3000);
  			 
  			//click on "Try Here" button under "Types of Trees" link under Trees
  			 driver.findElement(By.linkText("Try here>>>")).click();
  			 Thread.sleep(3000);
  			 
  			 driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("class Node:\n"
  			 		+ "   def __init__(self, data):\n"
  			 		+ "      self.left = None\n"
  			 		+ "      self.right = None\n"
  			 		+ "      self.data = data\n"
  			 		+ "   def insert(self, data):");
  				 Thread.sleep(3000);
  				 driver.findElement(By.xpath("//*[@id=\"answer_form\"]/button")).click();
  				 Thread.sleep(3000);
  				 driver.switchTo().alert().accept();
  				 Thread.sleep(3000);
  				 driver.switchTo().activeElement();
  				 Thread.sleep(3000);
  				 
  			 	 
  			//go back to 'Tree' page
  			 driver.get("https://dsportalapp.herokuapp.com/tree/");
  			 Thread.sleep(3000);
  			 
  			//Scroll Down to see more links on Tree page
  			 JavascriptExecutor js9 = (JavascriptExecutor) driver;
  			 js9.executeScript("window.scrollBy(0,1500)", "");
  			 Thread.sleep(3000);
  			 
  			//click on "Tree Traversals" under Tree Page
  			 driver.findElement(By.linkText("Tree Traversals")).click();
  			 Thread.sleep(3000);
  			 
  			//Scroll Down to see more links on Tree page
  			 JavascriptExecutor js10 = (JavascriptExecutor) driver;
  			 js10.executeScript("window.scrollBy(0,2000)", "");
  			 Thread.sleep(3000);
  			 
  			//click on "Try Here" button under "Tree Traversals" link under Trees
  			 driver.findElement(By.linkText("Try here>>>")).click();
  			 Thread.sleep(3000);
  			 
  			 driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("# Preorder traversal\n"
  			 		+ "# Root -> Left ->Right\n"
  			 		+ "   def PreorderTraversal(self, root):\n"
  			 		+ "      res = []\n"
  			 		+ "      if root:\n"
  			 		+ "         res.append(root.data)\n"
  			 		+ "print(res)");
  			Thread.sleep(3000);
  			driver.findElement(By.xpath("//*[@id=\"answer_form\"]/button")).click();
  			Thread.sleep(3000);
  			driver.switchTo().alert().accept();
  			Thread.sleep(3000);
  			driver.switchTo().activeElement();
  			Thread.sleep(3000);
  			 
  			//go back to 'Trees' page 
  			 driver.get("https://dsportalapp.herokuapp.com/tree/");
  			 Thread.sleep(3000);
  			 
  			//Scroll Down to see more links on Tree page
  			 JavascriptExecutor js11 = (JavascriptExecutor) driver;
  			 js11.executeScript("window.scrollBy(0,1500)", "");
  			 Thread.sleep(3000);
  			 
  			//click on "Traversals-Illustration" under Tree Page
  			 driver.findElement(By.linkText("Traversals-Illustration")).click();
  			 Thread.sleep(3000);
  			 
  			//Scroll Down to see more links on Tree page
  			 JavascriptExecutor js12 = (JavascriptExecutor) driver;
  			 js12.executeScript("window.scrollBy(0,750)", "");
  			 Thread.sleep(3000);
  			 
  			//click on "Try Here" button under "Traversals-Illustration" link under Trees
  			 driver.findElement(By.linkText("Try here>>>")).click();
  			 Thread.sleep(3000);
  			 
  			 driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("# Print the Tree\n"
  			 		+ "   def PrintTree(self):\n"
  			 		+ "      if self.left:\n"
  			 		+ "         self.left.PrintTree()\n"
  			 		+ "      print(self.data)");
  			Thread.sleep(3000);
  			driver.findElement(By.xpath("//*[@id=\"answer_form\"]/button")).click();
  			Thread.sleep(3000);
  			driver.switchTo().alert().accept();
  			Thread.sleep(3000);
  			driver.switchTo().defaultContent();
  			Thread.sleep(3000);
  			 
  			//go back to 'Trees' page
  			 driver.get("https://dsportalapp.herokuapp.com/tree/");
  			 Thread.sleep(3000);
  			 
  			//Scroll Down to see more links on Tree page
  			 JavascriptExecutor js13 = (JavascriptExecutor) driver;
  			 js13.executeScript("window.scrollBy(0,1500)", "");
  			 Thread.sleep(3000);
  			 
  			//click on "Binary Trees" under Tree Page
  			 driver.findElement(By.linkText("Binary Trees")).click();
  			 Thread.sleep(3000);
  			 
  			//Scroll Down to see more links on Tree page
  			 JavascriptExecutor js14 = (JavascriptExecutor) driver;
  			 js14.executeScript("window.scrollBy(0,750)", "");
  			 Thread.sleep(3000);
  			 
  			//click on "Try Here" button under "Binary Trees" link under Trees
  			 driver.findElement(By.linkText("Try here>>>")).click();
  			 Thread.sleep(3000);
  			 
  			 driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("class Node:\n"
  			 		+ "   def __init__(self, data):\n"
  			 		+ "      self.left = None\n"
  			 		+ "      self.right = None\n"
  			 		+ "      self.data = data\n"
  			 		+ "   def PrintTree(self):\n"
  			 		+ "      print(self.data)\n"
  			 		+ "\n"
  			 		+ "root = Node(10)\n"
  			 		+ "root.PrintTree()");
  			Thread.sleep(3000);
  			driver.findElement(By.xpath("//*[@id=\"answer_form\"]/button")).click();
  			Thread.sleep(3000);
  			driver.switchTo().alert().accept();
  			Thread.sleep(3000);
  			driver.switchTo().defaultContent();
  			Thread.sleep(3000);
  					 
  			//go back to 'Trees' page under Trees
  			 driver.get("https://dsportalapp.herokuapp.com/tree/");
  			 Thread.sleep(3000);
  			 
  			//Scroll Down to see more links on Tree page
  			 JavascriptExecutor js15 = (JavascriptExecutor) driver;
  			 js15.executeScript("window.scrollBy(0,1500)", "");
  			 Thread.sleep(3000);
  			 
  			//click on "Types of Binary Trees" under Tree Page
  			 driver.findElement(By.linkText("Types of Binary Trees")).click();
  			 Thread.sleep(3000);
  			 
  			//Scroll Down to see more links on Tree page
  			 JavascriptExecutor js16 = (JavascriptExecutor) driver;
  			 js16.executeScript("window.scrollBy(0,750)", "");
  			 Thread.sleep(3000);
  			 
  			//click on "Try Here" button under "Types of Binary Trees" link under Trees
  			 driver.findElement(By.linkText("Try here>>>")).click();
  			 Thread.sleep(3000);
  			 
  			 driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("# findval method to compare the value with nodes\n"
  			 		+ "   def findval(self, lkpval):\n"
  			 		+ "      if lkpval < self.data:\n"
  			 		+ "   return self.left.findval(lkpval)\n"
  			 		+ " print(str(self.data) + ' is found')");
  			Thread.sleep(3000);
  			driver.findElement(By.xpath("//*[@id=\"answer_form\"]/button")).click();
  			Thread.sleep(3000);
  			driver.switchTo().alert().accept();
  			Thread.sleep(3000);
  			driver.switchTo().defaultContent();
  			Thread.sleep(3000);
  			 
  			//go back to 'Trees' page under Trees
  			 driver.get("https://dsportalapp.herokuapp.com/tree/");
  			 Thread.sleep(3000);
  			 
  			//Scroll Down to see more links on Tree page
  			 JavascriptExecutor js17 = (JavascriptExecutor) driver;
  			 js17.executeScript("window.scrollBy(0,1500)", "");
  			 Thread.sleep(3000);
  			 
  			//click on "Implementation in Python" under Tree Page
  			 driver.findElement(By.linkText("Implementation in Python")).click();
  			 Thread.sleep(3000);
  			 
  			//Scroll Down to see more links on Tree page
  			 JavascriptExecutor js18 = (JavascriptExecutor) driver;
  			 js18.executeScript("window.scrollBy(0,750)", "");
  			 Thread.sleep(3000);
  			 
  			//click on "Try Here" button under "Implementation in Python" link under Trees
  			 driver.findElement(By.linkText("Try here>>>")).click();
  			 Thread.sleep(3000);
  			 
  			 driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("def pre_order(self);\n"
  			 		+ " print(self.value);");
  			Thread.sleep(3000);
  			driver.findElement(By.xpath("//*[@id=\"answer_form\"]/button")).click();
  			Thread.sleep(3000);
  			driver.switchTo().alert().accept();
  			Thread.sleep(3000);
  			driver.switchTo().defaultContent();
  			Thread.sleep(3000);
  			 
  			//go back to 'Trees' page
  			 driver.get("https://dsportalapp.herokuapp.com/tree/");
  			 Thread.sleep(3000);
  			 
  			//click on "Binary Tree Traversals" under Tree Page
  			 driver.findElement(By.linkText("Binary Tree Traversals")).click();
  			 Thread.sleep(3000);
  			 
  			//Scroll Down to see more links on Tree page
  			 JavascriptExecutor js19 = (JavascriptExecutor) driver;
  			 js19.executeScript("window.scrollBy(0,750)", "");
  			 Thread.sleep(3000);
  			 
  			//click on "Try Here" button under "Binary Tree Traversals" link under Trees
  			 driver.findElement(By.linkText("Try here>>>")).click();
  			 Thread.sleep(3000);
  			 
  			 driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("x=[1,2,3,4]\n"
  				 		+ "x.insert(3,5)\n"
  				 		+ "print(O(x))");
  			Thread.sleep(3000);
  			driver.findElement(By.xpath("//*[@id=\"answer_form\"]/button")).click();
  			Thread.sleep(3000);
  			driver.switchTo().alert().accept();
  			Thread.sleep(3000);
  			driver.switchTo().defaultContent();
  			Thread.sleep(3000);
  			 
  			//go back to 'Trees' page under Trees
  			 driver.get("https://dsportalapp.herokuapp.com/tree/");
  			 Thread.sleep(3000);
  			 
  			//Scroll Down to see more links on Tree page
  			 JavascriptExecutor js20 = (JavascriptExecutor) driver;
  			 js20.executeScript("window.scrollBy(0,750)", "");
  			 Thread.sleep(3000);
  			 
  			 
  			//click on "Implementation of Binary Trees" under Tree Page
  			 driver.findElement(By.linkText("Implementation of Binary Trees")).click();
  			 Thread.sleep(3000);
  			 
  			//Scroll Down to see more links on Tree page
  			 JavascriptExecutor js21 = (JavascriptExecutor) driver;
  			 js21.executeScript("window.scrollBy(0,2000)", "");
  			 Thread.sleep(3000);
  			 
  			//click on "Try Here" button under "Implementation of Binary Trees" link under Trees
  			 driver.findElement(By.linkText("Try here>>>")).click();
  			 Thread.sleep(3000);
  			 
  			 driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("def inorder_print(self, start, traversal):\n"
  			 		+ "\n"
  			 		+ "        \"\"\"Left->Root->Right\"\"\"\n"
  			 		+ "\n"
  			 		+ "        if start:\n"
  			 		+ "\n"
  			 		+ "            traversal = self.inorder_print(start.left, traversal)\n"
  			 		+ "\n"
  			 		+ "            traversal += (str(start.value) + \"-\")\n"
  			 		+ "\n"
  			 		+ "            traversal = self.inorder_print(start.right, traversal)\n"
  			 		+ "\n"
  			 		+ "        return traversal\n"
  			 		+ "\n"
  			 		+ "print(tree.print_tree(\"inorder\"))");
  			Thread.sleep(3000);
  			driver.findElement(By.xpath("//*[@id=\"answer_form\"]/button")).click();
  			Thread.sleep(3000);
  			driver.switchTo().alert().accept();
  			Thread.sleep(3000);
  			driver.switchTo().defaultContent();
  			Thread.sleep(3000);
  			 
  			//go back to 'Trees' page
  			 driver.get("https://dsportalapp.herokuapp.com/tree/");
  			 Thread.sleep(3000);
  			 
  			 	 
  			//Scroll Down to see more links on Tree page
  			 JavascriptExecutor js22 = (JavascriptExecutor) driver;
  			 js22.executeScript("window.scrollBy(0,750)", "");
  			 Thread.sleep(3000);
  			 
  			//click on "Applications of Binary trees" under Tree Page
  			 driver.findElement(By.linkText("Applications of Binary trees")).click();
  			 Thread.sleep(3000);
  			 
  			//click on "Try Here" button under "Applications of Binary trees" link under Trees
  			 driver.findElement(By.linkText("Try here>>>")).click();
  			 Thread.sleep(3000);
  			 
  			 driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("import collections\n"
  			 		+ "DoubleEnded = collections.deque([\"Mon\",\"Tue\",\"Wed\"])\n"
  			 		+ "DoubleEnded.append(\"Thu\")\n"
  			 		+ "print (\"Appended at right - \")\n"
  			 		+ "print (DoubleEnded)");
  			Thread.sleep(3000);
  			driver.findElement(By.xpath("//*[@id=\"answer_form\"]/button")).click();
  			Thread.sleep(3000);
  							
  			//go back to 'Overview of Trees' page under Trees
  			 driver.get("https://dsportalapp.herokuapp.com/tree/");
  			 Thread.sleep(3000);
  			 
  			//Scroll Down to see more links on Tree page
  			 JavascriptExecutor js23 = (JavascriptExecutor) driver;
  			 js23.executeScript("window.scrollBy(0,750)", "");
  			 Thread.sleep(3000);
  			 
  			//click on "Binary Search Trees" under Tree Page
  			 driver.findElement(By.linkText("Binary Search Trees")).click();
  			 Thread.sleep(3000);
  			 
  			//Scroll Down to see more links on Tree page
  			 JavascriptExecutor js24 = (JavascriptExecutor) driver;
  			 js24.executeScript("window.scrollBy(0,1200)", "");
  			 Thread.sleep(3000);
  			 
  			//click on "Try Here" button under "Applications of Binary trees" link under Trees
  			 driver.findElement(By.linkText("Try here>>>")).click();
  			 Thread.sleep(3000);
  			 
  			 driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("def pre_order(self):\n"
  			 		+ " print(self.value)\n"
  			 		+ " self.left_child:\n"
  			 		+ "        self.left_child.pre_order()");
  			Thread.sleep(3000);
  			driver.findElement(By.xpath("//*[@id=\"answer_form\"]/button")).click();
  			Thread.sleep(3000);
  			driver.switchTo().alert().accept();
  			Thread.sleep(3000);
  			driver.switchTo().defaultContent();
  			Thread.sleep(3000);
  			 
  			//go back to 'Trees' page
  			 driver.get("https://dsportalapp.herokuapp.com/tree/");
  			 Thread.sleep(3000);
  			 
  			//Scroll Down to see more links on Tree page
  			 JavascriptExecutor js25 = (JavascriptExecutor) driver;
  			 js25.executeScript("window.scrollBy(0,750)", "");
  			 Thread.sleep(3000);
  			 
  			//click on "Implementation Of BST" under Tree Page
  			 driver.findElement(By.linkText("Implementation Of BST")).click();
  			 Thread.sleep(3000);
  			 
  			//Scroll Down to see more links on Tree page
  			 JavascriptExecutor js26 = (JavascriptExecutor) driver;
  			 js26.executeScript("window.scrollBy(0,750)", "");
  			 Thread.sleep(3000);
  			 
  			//click on "Try Here" button under "Implementation Of BST" link under Trees
  			 driver.findElement(By.linkText("Try here>>>")).click();
  			 Thread.sleep(3000);
  			 
  			 driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("class BinarySearchTreeNode:\n"
  			 		+ "            def __init__(self,data):\n"
  			 		+ "    self.data=data\n"
  			 		+ "    self.left=None\n"
  			 		+ "    self.right=None\n"
  			 		+ "           def add_child(self,data):");
  			Thread.sleep(3000);
  			driver.findElement(By.xpath("//*[@id=\"answer_form\"]/button")).click();
  			Thread.sleep(3000);
  			driver.switchTo().alert().accept();
  			Thread.sleep(3000);
  			driver.switchTo().defaultContent();
  			Thread.sleep(3000);
  			 
  			//go back to 'Overview of Trees' page under Trees
  			 driver.get("https://dsportalapp.herokuapp.com/tree/overview-of-trees/");
  			 Thread.sleep(3000);
  			 
  			//Scroll Down to see more links on Tree page
  			 JavascriptExecutor js27 = (JavascriptExecutor) driver;
  			 js27.executeScript("window.scrollBy(0,750)", "");
  			 Thread.sleep(3000);
  			 
  			//click on " Practice Questions" under Tree Page
  			 driver.findElement(By.linkText("Practice Questions")).click();
  			 Thread.sleep(3000);
  			 
  				 
  			//go back to 'Home' page
  			 driver.get("https://dsportalapp.herokuapp.com/home");
  			 Thread.sleep(3000);
  		  
  		  driver.findElement(By.linkText("Sign out")).click();
  		  Thread.sleep(3000);
  		 
  	 }
  	
  		}
    }
  
    @BeforeTest
    @Parameters("browser")
    public void setup(@Optional("browser") String browser) throws Exception {
  	  
  		 //Check if parameter passed from TestNG is 'chrome'
  			 if(browser.equalsIgnoreCase("chrome")){
  				//set path to chromedriver.exe
  				 System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
  			     driver = new ChromeDriver();
  			 }
  			 //Check if parameter passed as 'firefox'
  			 else if(browser.equalsIgnoreCase("firefox")){
  			 
  			   //create firefox instance
  				 System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe");
  				 driver = new FirefoxDriver();
  			 }
  			 else if(browser.equalsIgnoreCase("Edge")){
  			 //set path to Edge.exe
  				 System.setProperty("webdriver.edge.driver", "c:\\msedgedriver.exe");
  			     driver = new EdgeDriver();
  				 Thread.sleep(5000);
  			 }
  			 else{
  					//If no browser is passed throw exception
  				throw new Exception("Incorrect Browser");
  				}
  	      driver.manage().window().maximize();
  		   Thread.sleep(3000);
  		   driver.get("https://dsportalapp.herokuapp.com/");
  		   Thread.sleep(3000);
  		
    }

    @AfterTest
    public void afterTest() {
    driver.close();
    }

  }
