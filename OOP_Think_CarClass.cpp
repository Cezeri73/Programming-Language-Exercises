#include <iostream>
using namespace std;

class Car {  // Here we define a class which it name is Car
public:				// this is a access  modifier that allow to be access from outside
    string brand;	
    int year;

    void displayInfo() {	// this is method to print the brand and the year of the Car
        cout << "Brand: " << brand << ", Year: " << year << endl;
    }
};

int main() {	// Main Class starts
    Car toyota;	//this is instantiation for new car object which is toyota 
    	
    toyota.brand = "Toyota";
    toyota.year = 2020;
    toyota.displayInfo();

    Car ford;	//this is instantiation for new car object which is ford 
    ford.brand = "Ford";  // The new object access the Cars behaviors
    ford.year = 2018;
    ford.displayInfo();	// The ford access the methods of the Car class . 

    return 0;
}

