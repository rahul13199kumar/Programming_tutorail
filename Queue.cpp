#include <iostream>
#include <queue>

using namespace std;

void main(queue<int>QUEUE){
	queue<int>q=QUEUE;
	while(!q.empty()){
		cout<<q.front()<<endl<<"";
		q.pop();
	}

	cout<<endl;
}


int main()
{
	queue<int>q;

	q.push(-9);
	q.push(89);
	q.push(23);
	q.push(65);
	q.push(32);

	show(q);
}