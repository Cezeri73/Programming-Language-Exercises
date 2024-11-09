#include <iostream>
using namespace std;

// Temel sýnýf
class Shape {
public:
    virtual void draw() const = 0; // Pure virtual function
};

// Circle sýnýfý
class Circle : public Shape {
public:
    void draw() const override {
        cout << "Drawing a Circle" << endl;
    }
};

// Rectangle sýnýfý
class Rectangle : public Shape {
public:
    void draw() const override {
        cout << "Drawing a Rectangle" << endl;
    }
};

int main() {
    // Shape türünden bir pointer oluþturalým
    Shape* shapePtr;

    // Circle nesnesine iþaret eden bir pointer tanýmlayalým
    shapePtr = new Circle();
    shapePtr->draw(); // Circle'ýn draw fonksiyonunu çaðýrýr

    // Rectangle nesnesine iþaret eden bir pointer tanýmlayalým
    delete shapePtr; // Önceki belleði serbest býrak
    shapePtr = new Rectangle();
    shapePtr->draw(); // Rectangle'ýn draw fonksiyonunu çaðýrýr

    // Dinamik belleði serbest býrakmak
    delete shapePtr;

    return 0;
}

