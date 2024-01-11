package com.rathod.oops;
class Dog1

{
	int [] key;                      //recommended
	//int key [];                   //legal but bad
	


	String [][][][] occupantName ;        //3 dim
	String [] ManagerName [] ;            //2 dim



	int [5] scores;                   //never legal


	int [] testScore;
	testScore = new int[4];          //legal 



	int [] testScore = new int[4];   //single line declrcn

	

	Thread thread = new int[4];      //Array of object type.


	int [] carList = new int [];     //illegal  needs a size.


	int [][] myArray = new int [3][];   //2 dim array of type int since JVM needs
	                           //to know only size of obj assigned to var myArray. 



    Animal [] pets = new Animal[3];//1 array obj vt null ref(pets)of Animal on heap.
		pets[1] = new Animal();
		pets[2] = new Animal();        //some Animal obj on HEAP assign them to 3 index position.
		pets[3] = new Animal();



    int [] x = new int[5];
	    x[4] = 2;      //ok
		x[5] = 3;      //Runtime exception out of index(0 to 4)




    int z[] = new int[2];
	     int y = -3;
		 z[y] = 4;    //Runtime Exception  y is -ve no.(always +ve)



    
	int [][] scores = new int[3][];   //declr & cret arry holding 3 ref of int arrys.
        scores[0] = new int [4];      //1st elm in scores arry is int arry of 4 int ele.
        scores[1] = new int [6];      //2nd elm in scores arry is int arry of 6 int ele.
		scores[2] = new int [1];      //3rd elm in scores arry is int arry of 1 int ele.
    

	

	int x=9;
    int [] dots = {6,x,9};          //legal
    
	//OR
    
	int [] dots;
	dots = new int[3];
	int x=9;
		dots[0] = 6;
		dots[1] = x;
		dots[2] = 8;
     
    



	Dog puppy = new Dog ("FRODO");         //4 obj here rectify it?
	Dog [] mydogs = {puppy , new Dog("JIMMY"),new Dog("KALU") };




    int [][] scores = {{5,3,6,7},{9,6},{1,8}};   //multi dim arry.
                scores[0]    = 4 elm.
		       	scores[1]    = 2 elm.
				scores[2]    = 2 elm.
				scores[0][1] = val is 3  
				scores[2][1] = val is 8

    

	Cat [][] myCats = {       //2 dim Cat arry obj,    Rectify how many obj here?
		                {     //Cat arry obj    & Cat obj
						    new Cat("Flufy"), new Cat("Zeus"),new Cat("Billu")
		                   ,new Cat("Bilbo"),new Cat("Bil"),
						}
					} 

   



	public static void main(String[] args) 
	{
		Dog1 [] myDogs = new Dog1[6];
			for (int x=0; x < myDogs.length ; x++ )
		 myDogs[x] = new Dog();		
		System.out.println("Hello World!");
	}
}
