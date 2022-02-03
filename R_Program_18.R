
a <-array(c('green','yellow','blue'),dim=c(3,3,3))
print(a)
a <-array(c('green','yellow','blue'),dim=c(3,3,3))
print(a)

#factor data-type object

apple_color <- c('green','green','yellow','red','red','yellow')
factor_apple <- factor(apple_color)
print(factor_apple)
print(nlevels(factor_apple))

#Dataframe

BMI <- data.frame(
  gender = c("male","Male","Female"),
  height = c(164,165.3,149),
  weight = c(92,70,54),
  Age = c(23,21,45)
)
print(BMI)

summary(BMI)
nrow(BMI)
dim(BMI)


#hands on practice 

BMI <- data.frame(
  gender = c("Male","Female","Male","Male","Female"),
  Name = c("Rahul","Rakhi","Ravi","Ram","Manpreet"),
  Roll_no = c(1190,1181,1120,1124,1257),
  Subject = c("DSA","R_Programming","OOPS","Excel","Cloud_Computing"),
  Marks = c(87,93,91,80,90)
)
print(BMI)

summary(BMI)



V <- 4.5:15.5
print(V)

print(seq(2,10, by =0.6)) 
seq(1,3, by=0.1)


t<- c("sun","Mon","tue","wed","thu","fri","sat")
u <- t[c(2,3,6)]
print(u)

v <- t[c(TRUE,FALSE,FALSE,TRUE,FALSE,FALSE,TRUE)]
print(v)

x<- t[c(-2,-5)]
print(x)

y <-t[c(1,0,0,0,0,0,0)]
print(y)

z<- t[c(0,0,0,0,0,0,0,1)]
print(z)

q<- t[c(1,0,0,1,0,1,0,1)]
print(q)



x<- 1:7
x
x[3]
x[c(2,4)]
x[-1]
x[c(2,-4)]
x[c(2.4,3.54)]


v1 <-c(3,8,4,5,0,11)
v2 <-c(2,4,1,3,4,11)
print(v1+v2)



# sort the elements in the reverse order

revsort.result <- sort(v,decreasing =TRUE)
print(revsort.result)


v <- c("Red","Green","Blue","Violet")
sort.result<- sort(v)
print(sort.result)


revsort.result <- sort(v,decreasing=TRUE)
print(revsort.result)


#modifying vector elements

x<- c(-3,-2,-1,0,1,2)
x[2] <- 0;  # modify 2nd element
x[x<0] <- 5;x # modify elements less than 0
x <-x[1:4];x  #truncate x to first 4 elements
x
x<- NULL
x


# create a list containing strings , numbers, vectors and logical

list_data = list("R","Tableau",c(1,2,3,1), TRUE, 125.17,75.88)
print("Class of Maneet Kaur Mam:")
print(list_data)
