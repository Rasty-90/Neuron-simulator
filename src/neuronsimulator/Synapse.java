/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neuronsimulator;

/**
 *
 * @author user
 */
public class Synapse {
    
   Neuron masterNeuron;
   Neuron neighborNeuron;
   double sigma;
    
   double calculateNewUValue(){
        double influence;
        influence= sigma * (neighborNeuron.u -masterNeuron.u);
        return influence;
    }

    public Synapse(Neuron masterNeuron, Neuron neighborNeuron,double sigma) {
        this.masterNeuron = masterNeuron;
        this.neighborNeuron = neighborNeuron;
        this.sigma=sigma;    
    }
    
}