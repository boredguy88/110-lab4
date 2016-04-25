package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Celsius extends Temperature {

        public Celsius(float t)
        {
            super(t);
        }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float a = (this.getValue() * 9)/5;
        a = a + 32;
        this.value = a;
        return this;
    }


    public String toString()
        {
            // TODO: Complete this method
            return "" + this.getValue();
        }
}
