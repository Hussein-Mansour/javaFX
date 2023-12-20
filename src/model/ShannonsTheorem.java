/*
Student Name:Hussein Mansour
Student Number:041058393
Course & Section #: 23S_CST8288_031
Declaration: This is my own original work and is free from Plagiarism.
*/

package model;

/**
 * Class that implements "model" for an MVC application that calculates Shannon's Theorem
 * @author kriger, yapt, hussein
 */
public class ShannonsTheorem {
    private double bandWidth;
    private double signalPower;
    private double noisePower;
    /**
     * multi-argument constructor
     * @param bandWidth the bandwidth in hertz
     * @param signalPower signal power in watts
     * @param noisePower noise power in watts
     */
    public ShannonsTheorem(double bandWidth, double signalPower, double noisePower) {
        this.bandWidth = bandWidth;
        this.signalPower = signalPower;
        this.noisePower = noisePower;
    } // end multi-argument constructor

    /**
     * no-arg constructor sets fields to zero
     */
    public ShannonsTheorem() {
	this(0.0, 0.0, 0.0);
    } // end no-arg constructor

    /**
     * @return the bandWidth
     */
    public double getBandWidth() {
    	return bandWidth;
    } // end getter width

    /**
     * @param bandWidth the bandWidth to set
     */
    public void setBandWidth(double bandWidth) {
        this.bandWidth = bandWidth;
    } // end setter width

    /**
     * @return the signal power
     */
    public double getSignalPower() {
    	return signalPower;
    } // end getter single power
    
    /**
     * @param signalPower the signal power to set
     */
    public void setSignalPower(double signalPower) {
	this.signalPower = signalPower;
    } // end setter single power

    /**
     * @return the noise power
     */
    public double getNoisePower() {
	return noisePower;
    } // end getter noise power

    /**
     * @param noisePower the noise power to set
     */
    public void setNoisePower(double noisePower) {
	this.noisePower = noisePower;
    } // end setter noise power
	
    private double log2(double x) {
	return Math.log(x)/Math.log(2);
    } // end method log2()
	
    /**
     * @param bw the bandwidth
     * @param sp the signal power
     * @param np the noise power
     * @return maximum data rate
     */
    public double maxDataRate(double bw, double sp, double np) {
        return bw * log2(1 + sp / np);
    } // end method maxDataRate()
	
    /**
     * @return maximum data rate
     */
    public double maxDataRate() {
        return maxDataRate(bandWidth, signalPower, noisePower);
    } // end method maxDateRate()

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */

    /**
     * @return string for output
     */
    @Override
    public String toString() {
	return "ShannonsTheory [bandWidth=" + bandWidth + ", signalPower=" + signalPower + ", noisePower=" + noisePower + "]";
    } // end toString() method

} // end class ShannonsTheorem :)
