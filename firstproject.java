import java.util.Scanner;
class newhome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Welcome to Dominos !!");
int kk=0,total=0;
double finaltotal;
do{ 
int u=0,k=0,w=0,t=0;  
System.out.println("Enter 1 for Food or 2 for Beverages.");
int q=sc.nextInt();

switch(q)
{
case 1:  
System.out.println("You are in Food section. Enter 1 for veg or 2 for non-veg.");
int m=sc.nextInt();
switch(m)
       {
       case 1:
       System.out.println("You are in Veg section.");
       veg v1=new veg();
       w=v1.pizza();
       break;

       case 2:
       System.out.println("You are in Non-veg section.");
       nonveg v2=new nonveg();
       t=v2.chicken();
       break;
       }
break;
case 2:
System.out.println("You are in Beverages section. Enter 1 for cold drink or 2 for hot drink.");
int y=sc.nextInt();
switch(y)
       {
       case 1:
       System.out.println("You are in Cold-drink section.");
       cold c2=new cold();
       k=c2.cat();
       break;

       case 2:
       System.out.println("You are in hot-drink section.");
       
       hot h1=new hot();
       u=h1.bs();
       break;
       }
break;
}
total=total+u+k+t+w;
System.out.println("Your total order amounts Rs "+total);

finaltotal=1.0*total;
finaltotal=total+(0.1*total);



System.out.println("Do you want something else? Enter 1 for yes or 2 for no");
kk=sc.nextInt();
}while(kk==1);
if(kk==2)
{System.out.println("Thanks for the order. Please visit again.");
System.out.println("After taxes, your total order amounts Rs "+finaltotal);}
}
}

class veg
{
public int pizza()
{
Scanner sc1=new Scanner(System.in);

System.out.println("Select any pizza out of the following.");
System.out.println("Pizza1  -  Rs 120/-");

System.out.println("Pizza2  -  Rs 170/-");

System.out.println("Pizza3  -  Rs 130/-");

System.out.println("Pizza4  -  Rs 110/-");

System.out.println("Pizza5  -  Rs 150/-");

System.out.println("Enter the choice - 1/2/3/4/5.");
int ak=sc1.nextInt();
int g=0;
switch(ak)
{
case 1:
System.out.println("You have choosen the Pizza1. It is of Rs 120/-. Enter the quantity.");
int aaa=sc1.nextInt();
g=aaa*120;
break;

case 2:
System.out.println("You have choosen the Pizza2. It is of Rs 170/-. Enter the quantity.");
int bbb=sc1.nextInt();
g=bbb*170;
break;

case 3:
System.out.println("You have choosen the Pizza3. It is of Rs 130/-. Enter the quantity.");
int bq=sc1.nextInt();
g=bq*130;
break;

case 4:
System.out.println("You have choosen the Pizza4. It is of Rs 110/-. Enter the quantity.");
int bf=sc1.nextInt();
g=bf*110;
break;

case 5:
System.out.println("You have choosen the Pizza5. It is of Rs 150/-. Enter the quantity.");
int bgg=sc1.nextInt();
g=bgg*150;
break;

default :
System.out.println("wrong input");
g=0;
break;
}
return g;
}
}



class nonveg
{
public int chicken()
{
Scanner sc2=new Scanner(System.in);
System.out.println("Select any nonveg item out of the following.");

System.out.println("chicken1  -  Rs 320/-");

System.out.println("chicken2  -  Rs 370/-");


System.out.println("Enter the choice - 1/2.");

int aa=sc2.nextInt();
int bh=0;
switch(aa)
{
case 1:
System.out.println("You have choosen the chicken1. It is of Rs 320/-. Enter the quantity.");
int bz=sc2.nextInt();
bh=bz*320;
break;

case 2:
System.out.println("You have choosen the chicken2. It is of Rs 370/-. Enter the quantity.");
int ba=sc2.nextInt();
bh=ba*370;
break;

}
return bh;
}
}

class hot
{
public int bs()
{
Scanner sc3=new Scanner(System.in);
System.out.println("You are in Hot drinks Section.Enter 1 for coffee or 2 for tea.");
int z=sc3.nextInt();
if(z==1)
{
System.out.println("You have selected coffee which is of Rs 95/-. Enter quantity.");
int v=sc3.nextInt();
int sum=v*95;
return sum;
}
else
{
System.out.println("You have selected tea which is of Rs 35/-. Enter quantity.");
int b=sc3.nextInt();
int sum1=b*35;
return sum1;
}
}
}

class cold
{
public int cat()
{
Scanner sc4=new Scanner(System.in);
System.out.println("You are in cold drinks Section.Enter 1 for pepsi or 2 for limca.");
int l=sc4.nextInt();
if(l==1)
{
System.out.println("You have selected pepsi which is of Rs 75/-. Enter quantity.");
int jj=sc4.nextInt();
int suma=jj*75;
return suma;
}
else
{
System.out.println("You have selected limca which is of Rs 78/-. Enter quantity.");
int ax=sc4.nextInt();
int sum1a=ax*78;
return sum1a;
}
}
}