package com.lijin.test4;

//间接继承A  extends表示连接A
public class C extends A
{
	//分数
	float  score;
	   
	   public void  setScore(float  score)
	   {
		   //this表示当前对象，表示谁调用this就代表谁
		   this.score=score;
	   }

}
