public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    Rectangle() { }
    Rectangle( float length, float width){
        setLength(length);
        setWidth(width);
    }
    public void setLength(float length){
        if ((length>0.0f) && (length<20.0f)){
            this.length = length;}


    }

    public void setWidth(float width) {
        if ((width>0.0f) && (width<20.0f)){
            this.width = width;}
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public float perimeter(){
        return 2*(getLength()+getWidth());
    }
    public float area(){
        return getLength()*getWidth();
    }
}
