#include <iostream>
using namespace std;

// Temel s�n�f
class Shape {
public:
    virtual void draw() const = 0; // Pure virtual function
};

// Circle s�n�f�
class Circle : public Shape {
public:
    void draw() const override {
        cout << "Drawing a Circle" << endl;
    }
};

// Rectangle s�n�f�
class Rectangle : public Shape {
public:
    void draw() const override {
        cout << "Drawing a Rectangle" << endl;
    }
};

int main() {
    // Shape t�r�nden bir pointer olu�tural�m
    Shape* shapePtr;

    // Circle nesnesine i�aret eden bir pointer tan�mlayal�m
    shapePtr = new Circle();
    shapePtr->draw(); // Circle'�n draw fonksiyonunu �a��r�r

    // Rectangle nesnesine i�aret eden bir pointer tan�mlayal�m
    delete shapePtr; // �nceki belle�i serbest b�rak
    shapePtr = new Rectangle();
    shapePtr->draw(); // Rectangle'�n draw fonksiyonunu �a��r�r

    // Dinamik belle�i serbest b�rakmak
    delete shapePtr;

    return 0;
}

