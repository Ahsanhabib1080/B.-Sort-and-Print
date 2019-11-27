#include<iostream>
#include<string.h>
#include<cmath>
#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t,i,j;
    cin>>t;
    int n=t;
    int roll[n];
    int marks[n];
    string name[n];
    for(i=0; i<n; i++)
    {
        cin>>roll[i];
        cin.ignore();
        cin>> name[i];
        cin>>marks[i];
    }
    for(i=0; i<n; i++)
    {
        for(j=0; j<n; j++)
        {
            if(marks[i]==marks[j])
            {
                swap(marks[j],marks[i]);
                swap(name[j],name[i]);
                swap(roll[j],roll[i]);
            }
            else if(marks[i]>marks[j])  // suppose i=100 and j is other  values.( watch the string problem text)
            {
                swap(marks[i],marks[j]);// marks[i] তম ভ্যালু হচ্ছে সুপিরিওর ভ্যালু (  অর্থাৎ যাকে ধরে কাজ করা  হচ্ছে) এবং এইটাতে array আকারে ডাটা  সেভ হবে।এবং marks[j] তম ভ্যালু এমন ভ্যালু যাকে নিয়ে তুলোনা করা হচ্ছে ( প্রতিটা মারক্স এর সাথে)
                swap(roll[i],roll[j]);
                swap(name[i],name[j]);
            }
        }
    }
int asize=0;

    cout<<"Roll " ;
    cout<< "| Name       ";
    cout<<"| Marks\n";
    cout<<"-------------------------\n";
    for(i=0; i<n; i++)
    {
        asize=log10(roll[i])+1;
        for(j=1; j<=(4-asize); j++)
        {
            cout<<" ";
        }
        cout<<roll[i]<<" ";
        int stringsize=name[i].size();
        cout<<"| ";
        cout<<name[i];
        for( j=1; j<=(11-stringsize); j++)
        {
            cout<<" ";
        }
        cout <<"| "<<marks[i]<<"\n";

    }
















return 0;
/*int a;
scanf("%d",&a);
int size=log10(a)+1;
cout<<size<<"\n";
*/
}
