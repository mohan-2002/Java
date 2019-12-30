import java.util.*;
class MatrixAll
{
static Scanner in=new Scanner(System.in);
static int temp;
public static void main(String[]args)
{
temp=1;
System.out.println("1.Transpose of a Matrix\n2.Addition of Matrices\n3.Check Whether Diagnol Matrix or not\n4.Multiplication of Matrices\n5.Row Matrix\n6.Column Matrix\n7.Exit");
while(temp==1){
System.out.print("Choose the Option : ");
int option=in.nextInt();
switch(option){
case 1:
temp=0;
Transpose();
temp=0;
break;
case 2:
temp=0;
Addition();
break;
case 3:
temp=0;
Diagnol();
break;
case 4:
temp=0;
Multiplication();
break;
case 5:
temp=0;
Row();
break;
case 6:
temp=0;
Column();
break;
case 7:
System.exit(1);
default:
System.out.println("Invalid option.");}
}}
public static void Transpose(){
System.out.println("Enter the Size of Matrix in rows and columns Seperated by a Space : ");
int r=in.nextInt();
int c=in.nextInt();
int a[][]=new int[r][c];
int b[][]=new int[c][r];
System.out.println("Enter your Matrix");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
a[i][j]=in.nextInt();}}
for(int i=0;i<c;i++){
for(int j=0;j<r;j++){
b[i][j]=a[j][i];}}
System.out.println("The Transpose of the Matrix is ");
for(int i=0;i<c;i++){
for(int j=0;j<r;j++){
System.out.print(b[i][j]+" ");}
System.out.println();}
}
public static void Addition(){
System.out.println("Enter the Size of first Matrix in rows and columns Seperated by a Space : ");
int r1=in.nextInt();
int c1=in.nextInt();
System.out.println("Enter the Size of Second Matrix in rows and columns Seperated by a Space : ");
int r2=in.nextInt();
int c2=in.nextInt();
int a[][]=new int[r1][c1];
int b[][]=new int[r2][c2];
if(r1!=r2 && c1!=c2)
System.out.println("Addition not possible");
else
{
System.out.println("Enter the First Matrix");
for(int i=0;i<r1;i++){
for(int j=0;j<c1;j++){
a[i][j]=in.nextInt();}}
System.out.println("Enter the Second Matrix");
for(int i=0;i<r1;i++){
for(int j=0;j<c1;j++){
b[i][j]=in.nextInt();}}
System.out.println("Addition of those matrices is ");
for(int i=0;i<r1;i++){
for(int j=0;j<c1;j++){
System.out.print(a[i][j]+b[i][j]);}System.out.println();}
}}
public static void Diagnol(){
int temp1=1,temp2=1;
System.out.println("Enter the Size of Matrix in rows and columns Seperated by a Space : ");
int r1=in.nextInt();
int c1=in.nextInt();
if(r1!=c1)
System.out.println("Invalid Input");
else
{
int a[][]=new int[r1][c1];
System.out.println("Enter the elements of Matrix");
for(int i=0;i<r1;i++){
for(int j=0;j<c1;j++){
a[i][j]=in.nextInt();}}
for(int i=0;i<r1;i++){
for(int j=0;j<c1;j++){
if(i==j){
if(a[i][j]==0)
temp1=0;}
if(i!=j){
if(a[i][j]!=0)
temp2=0;}
}}
if(temp1==1 && temp2==1)
System.out.println("Diagnol Matrix");
else
System.out.println("Not a Diagnol Matrix");
}
}

public static void Multiplication(){
System.out.println("Enter the Size of first Matrix in rows and columns Seperated by a Space : ");
int r1=in.nextInt();
int c1=in.nextInt();
System.out.println("Enter the Size of Second Matrix in rows and columns Seperated by a Space : ");
int r2=in.nextInt();
int c2=in.nextInt();
int a[][]=new int[r1][c1];
int b[][]=new int[r2][c2];
if(c1!=r2)
System.out.println("Multiplication not possible");
else{
int sum=0;
int c[][]=new int[r1][c2];
System.out.println("Enter the First Matrix");
for(int i=0;i<r1;i++){
for(int j=0;j<c1;j++){
a[i][j]=in.nextInt();}}
System.out.println("Enter the Second Matrix");
for(int i=0;i<r1;i++){
for(int j=0;j<c1;j++){
b[i][j]=in.nextInt();}}
for(int i=0;i<r1;i++){
for(int j=0;j<c2;j++){
for(int k=0;k<r2;k++){
sum=sum+(a[i][k]*b[k][j]);}
c[i][j]=sum;
sum=0;}}
System.out.println("Product of Matrices");
for(int i=0;i<r1;i++){
for(int j=0;j<c2;j++){
System.out.print(c[i][j]+" ");
}
System.out.println();}
}}

public static void Row(){
System.out.println("Enter the Size of Matrix in rows and columns Seperated by a Space : ");
int r=in.nextInt();
int c=in.nextInt();
int a[][]=new int[r][c];
System.out.println("Enter your Matrix");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
a[i][j]=in.nextInt();}}
int b[][]=new int[1][c];
int sum=0;
for(int i=0;i<1;i++){
for(int j=0;j<c;j++){
for(int k=0;k<r;k++){
sum=sum+a[k][j];}
b[i][j]=sum;
sum=0;}}
System.out.println("Row Matrix is : ");
for(int i=0;i<1;i++){
for(int j=0;j<c;j++){
System.out.print(b[i][j]+" ");
}}
}
public static void Column(){
System.out.println("Enter the Size of Matrix in rows and columns Seperated by a Space : ");
int r=in.nextInt();
int c=in.nextInt();
int a[][]=new int[r][c];
System.out.println("Enter your Matrix");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
a[i][j]=in.nextInt();}}
int b[][]=new int[r][1];
int sum=0;
for(int i=0;i<1;i++){
for(int j=0;j<r;j++){
for(int k=0;k<c;k++){
sum=sum+a[j][k];}
b[j][i]=sum;
sum=0;}}
System.out.println("Column Matrix is : ");
for(int i=0;i<r;i++){
for(int j=0;j<1;j++){
System.out.print(b[i][j]+" ");
}System.out.println();}
}}




