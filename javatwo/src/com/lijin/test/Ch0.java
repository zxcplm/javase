package com.lijin.test;

import java.lang.reflect.Method;

//����java.util
import java.util.Date;

import com.lijin.test2.SendMail;

//lang���µ�ֱ�ӵ��࣬��Ϊ���Ƚ��ã����Բ�Ҫ���룬���Զ�����
//java�����е��඼�ڰ��£��϶��ġ�

//ͬ���µ��಻��Ҫ���룬��ͬ��������Ҫ�������ʹ��

//1.����java���е��඼���뽨������
//2.��������ȫ������Сд��
//3.���� ����Ҫ��:com.�������.������


public class Ch0
{
	String c1="123";
	
	//����ؼ�ctrl+shirft+o�ɻ��import java.lang.reflect.Method;
	Method c2=null;
	
	//ͬ���µ��಻��Ҫ���룬��ͬ��������Ҫ�������ʹ��
	Ch1 c3=new Ch1();
	
	SendMail s=new SendMail();
	
	Date d=new Date();

}
