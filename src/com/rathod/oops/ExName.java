package com.rathod.oops;
class ExRunnable  extends Thread  implements  Runnable 
{
	public void run()
	{
      for (int x = 1 ; x<100  ; x+=10)
      {
		  System.out.println(" Run by " + Thread.currentThread().getName() + " Number  is " + x );
		  try
		  {
		  	Thread.sleep(1*1000);   //halt for 1 sec
			if (100%x == 0)
			{
				System.out.println(x);
			}
		  }
		  catch (InterruptedException ex)
		  {  }
      }
	}
}
class ExName 
{
	public static void main(String[] args) 
	{
		ExRunnable nr = new ExRunnable();
		Thread one = new Thread(nr) ;          //number is not allowed as a ref name eg-Thread 1 = new Thread(nr) ;
		one.setName("First Thred - BALU");
		Thread two = new Thread(nr);
		two.setName("Second Thread - Arun");
		Thread three = new Thread(nr);
		three.setName("Third Thread - Mahesh");
		
		one.start();
		//one.join();         how to use join()?
		two.start();
		
		three.start();
	}
}
/*
G:\SCJP\Query\Solved>javac ExName.java
ExName.java:13: ';' expected
                                System.out.println(x)
                                                     ^
1 error

G:\SCJP\Query\Solved>javac ExName.java
ExName.java:11: incomparable types: int and boolean
                        if ((1000%10) == true)
                                      ^
1 error

G:\SCJP\Query\Solved>javac ExName.java
ExName.java:11: unexpected type
required: variable
found   : value
                        if ((1000%10) = true)
                                 ^
1 error

G:\SCJP\Query\Solved>javac ExName.java
ExName.java:11: unexpected type
required: variable
found   : value
                        if ((x%10) = true)
                              ^
1 error

G:\SCJP\Query\Solved>javac ExName.java
ExName.java:11: unexpected type
required: variable
found   : value
                        if ((x/10) = true)
                              ^
1 error

G:\SCJP\Query\Solved>javac ExName.java
ExName.java:11: unexpected type
required: variable
found   : value
                        if ((100/x) = true)
                                ^
1 error

G:\SCJP\Query\Solved>javac ExName.java
ExName.java:11: unexpected type
required: variable
found   : value
                        if (100%x = true)
                               ^
1 error

G:\SCJP\Query\Solved>javac ExName.java

G:\SCJP\Query\Solved>java ExName
 Run by BALUNumber1
 Run by ArunNumber1
 Run by MaheshNumber1
1
 Run by BALUNumber2
1
 Run by MaheshNumber2
1
 Run by ArunNumber2
2
 Run by BALUNumber3
2
 Run by MaheshNumber3
2
 Run by ArunNumber3
 Run by BALUNumber4
 Run by MaheshNumber4
 Run by ArunNumber4
4
 Run by BALUNumber5
4
 Run by MaheshNumber5
4
 Run by ArunNumber5
5
 Run by BALUNumber6
5
 Run by MaheshNumber6
5
 Run by ArunNumber6
 Run by BALUNumber7
 Run by MaheshNumber7
 Run by ArunNumber7
 Run by BALUNumber8
 Run by MaheshNumber8
 Run by ArunNumber8
 Run by BALUNumber9
 Run by MaheshNumber9
 Run by ArunNumber9
 Run by BALUNumber10
 Run by MaheshNumber10
 Run by ArunNumber10
10
 Run by BALUNumber11
10
 Run by MaheshNumber11
10
 Run by ArunNumber11
 Run by BALUNumber12
 Run by MaheshNumber12
 Run by ArunNumber12
 Run by BALUNumber13
 Run by MaheshNumber13
 Run by ArunNumber13
 Run by BALUNumber14
 Run by MaheshNumber14
 Run by ArunNumber14
 Run by BALUNumber15
 Run by MaheshNumber15
 Run by ArunNumber15
 Run by BALUNumber16
 Run by MaheshNumber16
 Run by ArunNumber16
 Run by BALUNumber17
 Run by MaheshNumber17
 Run by ArunNumber17
 Run by BALUNumber18
 Run by MaheshNumber18
 Run by ArunNumber18
 Run by BALUNumber19
 Run by MaheshNumber19
 Run by ArunNumber19
 Run by BALUNumber20
 Run by MaheshNumber20
 Run by ArunNumber20
20
 Run by BALUNumber21
20
 Run by MaheshNumber21
20
 Run by ArunNumber21
 Run by BALUNumber22
 Run by MaheshNumber22
 Run by ArunNumber22
 Run by BALUNumber23
 Run by MaheshNumber23
 Run by ArunNumber23
 Run by BALUNumber24
 Run by MaheshNumber24
 Run by ArunNumber24
 Run by BALUNumber25
 Run by MaheshNumber25
 Run by ArunNumber25
25
 Run by BALUNumber26
25
 Run by MaheshNumber26
25
 Run by ArunNumber26
 Run by BALUNumber27
 Run by MaheshNumber27
 Run by ArunNumber27
 Run by BALUNumber28
 Run by MaheshNumber28
 Run by ArunNumber28
 Run by BALUNumber29
 Run by MaheshNumber29
 Run by ArunNumber29
 Run by BALUNumber30
 Run by MaheshNumber30
 Run by ArunNumber30
 Run by BALUNumber31
 Run by MaheshNumber31
 Run by ArunNumber31
 Run by BALUNumber32
 Run by MaheshNumber32
 Run by ArunNumber32
 Run by BALUNumber33
 Run by MaheshNumber33
 Run by ArunNumber33
 Run by BALUNumber34
 Run by MaheshNumber34
 Run by ArunNumber34
 Run by BALUNumber35
 Run by MaheshNumber35
 Run by ArunNumber35
 Run by BALUNumber36
 Run by MaheshNumber36
 Run by ArunNumber36
 Run by BALUNumber37
 Run by MaheshNumber37
 Run by ArunNumber37
 Run by BALUNumber38
 Run by MaheshNumber38
 Run by ArunNumber38
 Run by BALUNumber39
 Run by MaheshNumber39
 Run by ArunNumber39
 Run by BALUNumber40
 Run by MaheshNumber40
 Run by ArunNumber40
 Run by BALUNumber41
 Run by MaheshNumber41
 Run by ArunNumber41
 Run by BALUNumber42
 Run by MaheshNumber42
 Run by ArunNumber42
 Run by BALUNumber43
 Run by MaheshNumber43
 Run by ArunNumber43
 Run by BALUNumber44
 Run by MaheshNumber44
 Run by ArunNumber44
 Run by BALUNumber45
 Run by MaheshNumber45
 Run by ArunNumber45
 Run by BALUNumber46
 Run by MaheshNumber46
 Run by ArunNumber46
 Run by BALUNumber47
 Run by MaheshNumber47
 Run by ArunNumber47
 Run by BALUNumber48
 Run by MaheshNumber48
 Run by ArunNumber48
 Run by BALUNumber49
 Run by MaheshNumber49
 Run by ArunNumber49
 Run by BALUNumber50
 Run by MaheshNumber50
 Run by ArunNumber50
50
 Run by BALUNumber51
50
 Run by MaheshNumber51
50
 Run by ArunNumber51
 Run by BALUNumber52
 Run by MaheshNumber52
 Run by ArunNumber52
 Run by BALUNumber53
 Run by MaheshNumber53
 Run by ArunNumber53
 Run by BALUNumber54
 Run by MaheshNumber54
 Run by ArunNumber54
 Run by BALUNumber55
 Run by MaheshNumber55
 Run by ArunNumber55
 Run by BALUNumber56
 Run by MaheshNumber56
 Run by ArunNumber56
 Run by BALUNumber57
 Run by MaheshNumber57
 Run by ArunNumber57
 Run by BALUNumber58
 Run by MaheshNumber58
 Run by ArunNumber58
 Run by BALUNumber59
 Run by MaheshNumber59
 Run by ArunNumber59
 Run by BALUNumber60
 Run by MaheshNumber60
 Run by ArunNumber60
 Run by BALUNumber61
 Run by MaheshNumber61
 Run by ArunNumber61
 Run by BALUNumber62
 Run by MaheshNumber62
 Run by ArunNumber62
 Run by BALUNumber63
 Run by MaheshNumber63
 Run by ArunNumber63
 Run by BALUNumber64
 Run by MaheshNumber64
 Run by ArunNumber64
 Run by BALUNumber65
 Run by MaheshNumber65
 Run by ArunNumber65
 Run by BALUNumber66
 Run by MaheshNumber66
 Run by ArunNumber66
 Run by BALUNumber67
 Run by MaheshNumber67
 Run by ArunNumber67
 Run by BALUNumber68
 Run by MaheshNumber68
 Run by ArunNumber68
 Run by BALUNumber69
 Run by MaheshNumber69
 Run by ArunNumber69
 Run by BALUNumber70
 Run by MaheshNumber70
 Run by ArunNumber70
 Run by BALUNumber71
 Run by MaheshNumber71
 Run by ArunNumber71
 Run by BALUNumber72
 Run by MaheshNumber72
 Run by ArunNumber72
 Run by BALUNumber73
 Run by MaheshNumber73
 Run by ArunNumber73
 Run by BALUNumber74
 Run by MaheshNumber74
 Run by ArunNumber74
 Run by BALUNumber75
 Run by MaheshNumber75
 Run by ArunNumber75
 Run by BALUNumber76
 Run by MaheshNumber76
 Run by ArunNumber76
 Run by BALUNumber77
 Run by MaheshNumber77
 Run by ArunNumber77
 Run by BALUNumber78
 Run by MaheshNumber78
 Run by ArunNumber78
 Run by BALUNumber79
 Run by MaheshNumber79
 Run by ArunNumber79
 Run by BALUNumber80
 Run by MaheshNumber80
 Run by ArunNumber80
 Run by BALUNumber81
 Run by MaheshNumber81
 Run by ArunNumber81
 Run by BALUNumber82
 Run by MaheshNumber82
 Run by ArunNumber82
 Run by BALUNumber83
 Run by MaheshNumber83
 Run by ArunNumber83
 Run by BALUNumber84
 Run by MaheshNumber84
 Run by ArunNumber84
 Run by BALUNumber85
 Run by MaheshNumber85
 Run by ArunNumber85
 Run by BALUNumber86
 Run by MaheshNumber86
 Run by ArunNumber86
 Run by BALUNumber87
 Run by MaheshNumber87
 Run by ArunNumber87
 Run by BALUNumber88
 Run by MaheshNumber88
 Run by ArunNumber88
 Run by BALUNumber89
 Run by MaheshNumber89
 Run by ArunNumber89
 Run by BALUNumber90
 Run by MaheshNumber90
 Run by ArunNumber90
 Run by BALUNumber91
 Run by MaheshNumber91
 Run by ArunNumber91
 Run by BALUNumber92
 Run by MaheshNumber92
 Run by ArunNumber92
 Run by BALUNumber93
 Run by MaheshNumber93
 Run by ArunNumber93
 Run by BALUNumber94
 Run by MaheshNumber94
 Run by ArunNumber94
 Run by BALUNumber95
 Run by MaheshNumber95
 Run by ArunNumber95
 Run by BALUNumber96
 Run by MaheshNumber96
 Run by ArunNumber96
 Run by BALUNumber97
 Run by MaheshNumber97
 Run by ArunNumber97
 Run by BALUNumber98
 Run by MaheshNumber98
 Run by ArunNumber98
 Run by BALUNumber99
 Run by MaheshNumber99
 Run by ArunNumber99

G:\SCJP\Query\Solved>
G:\SCJP\Query\Solved>javac ExName.java
ExName.java:5: not a statement
      for (int x = 1 ; x<100  ; x+10)
                                 ^
1 error

G:\SCJP\Query\Solved>javac ExName.java
ExName.java:5: ')' expected
      for (int x = 1 ; x<100  ; x++10)
                                   ^
ExName.java:5: ';' expected
      for (int x = 1 ; x<100  ; x++10)
                                     ^
2 errors

G:\SCJP\Query\Solved>javac ExName.java

G:\SCJP\Query\Solved>java ManyName
 Run by BALU
 Run by Mahesh
 Run by Arun

G:\SCJP\Query\Solved>javac ExName.java

G:\SCJP\Query\Solved>java ExName
 Run by BALU Number 1
 Run by Mahesh Number 1
 Run by Arun Number 1
1
 Run by BALU Number 11
1
 Run by Mahesh Number 11
1
 Run by Arun Number 11
 Run by BALU Number 21
 Run by Mahesh Number 21
 Run by Arun Number 21
 Run by BALU Number 31
 Run by Mahesh Number 31
 Run by Arun Number 31
 Run by BALU Number 41
 Run by Mahesh Number 41
 Run by Arun Number 41
 Run by BALU Number 51
 Run by Mahesh Number 51
 Run by Arun Number 51
 Run by BALU Number 61
 Run by Mahesh Number 61
 Run by Arun Number 61
 Run by BALU Number 71
 Run by Mahesh Number 71
 Run by Arun Number 71
 Run by BALU Number 81
 Run by Mahesh Number 81
 Run by Arun Number 81
 Run by BALU Number 91
 Run by Mahesh Number 91
 Run by Arun Number 91

G:\SCJP\Query\Solved>javac ExName.java

G:\SCJP\Query\Solved>java ExName
 Run by Arun Number 1
 Run by Mahesh Number 1
 Run by BALU Number 1
1
1
1
 Run by Mahesh Number 11
 Run by BALU Number 11
 Run by Arun Number 11
 Run by Mahesh Number 21
 Run by BALU Number 21
 Run by Arun Number 21
 Run by Mahesh Number 31
 Run by BALU Number 31
 Run by Arun Number 31
 Run by Mahesh Number 41
 Run by BALU Number 41
 Run by Arun Number 41
 Run by Mahesh Number 51
 Run by BALU Number 51
 Run by Arun Number 51
 Run by Mahesh Number 61
 Run by BALU Number 61
 Run by Arun Number 61
 Run by Mahesh Number 71
 Run by BALU Number 71
 Run by Arun Number 71
 Run by Mahesh Number 81
 Run by BALU Number 81
 Run by Arun Number 81
 Run by Mahesh Number 91
 Run by BALU Number 91
 Run by Arun Number 91

G:\SCJP\Query\Solved>
G:\SCJP\Query\Solved>javac ExName.java

G:\SCJP\Query\Solved>java ExName
 Run by First Thred - BALU Number  is 1
 Run by Third Thread - Mahesh Number  is 1
 Run by Second Thread - Arun Number  is 1
1
 Run by First Thred - BALU Number  is 11
1
 Run by Second Thread - Arun Number  is 11
1
 Run by Third Thread - Mahesh Number  is 11
 Run by First Thred - BALU Number  is 21
 Run by Second Thread - Arun Number  is 21
 Run by Third Thread - Mahesh Number  is 21
 Run by First Thred - BALU Number  is 31
 Run by Second Thread - Arun Number  is 31
 Run by Third Thread - Mahesh Number  is 31
 Run by First Thred - BALU Number  is 41
 Run by Second Thread - Arun Number  is 41
 Run by Third Thread - Mahesh Number  is 41
 Run by First Thred - BALU Number  is 51
 Run by Second Thread - Arun Number  is 51
 Run by Third Thread - Mahesh Number  is 51
 Run by First Thred - BALU Number  is 61
 Run by Second Thread - Arun Number  is 61
 Run by Third Thread - Mahesh Number  is 61
 Run by First Thred - BALU Number  is 71
 Run by Second Thread - Arun Number  is 71
 Run by Third Thread - Mahesh Number  is 71
 Run by First Thred - BALU Number  is 81
 Run by Second Thread - Arun Number  is 81
 Run by Third Thread - Mahesh Number  is 81
 Run by First Thred - BALU Number  is 91
 Run by Second Thread - Arun Number  is 91
 Run by Third Thread - Mahesh Number  is 91

G:\SCJP\Query\Solved>




*/