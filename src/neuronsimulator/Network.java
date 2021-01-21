/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neuronsimulator;

import java.util.Timer;

/**
 * @param numberOfNeurons the number or neurons provided by the user
 * @param r the number of neighbors. because we consider the neuron in a circular network, the total number of neighbors will be 2*r
 * @param mu the mu is fixed on mu=1 on the simulation canvas, it is passed here in the chance that it may change in the future
 * @param neuronList the list in which the neuron are stored
 */
public class Network {
    
    static int numberOfNeurons; //neuron number
    int r;  // influences number
    static double mu;

    static Neuron[] neuronList = new Neuron[numberOfNeurons];
    
    void createNetwork(){
  
         /**initializes the neurons  with random u values
          * and stores them in the neuron array
        */
        for (int i=0;i<numberOfNeurons;i++){
            Neuron n = new Neuron( Math.random(),i);
            neuronList[i]=n;
       
        }
        
        /**creates synapses for each neuron
        */
       for (int i=0;i<neuronList.length;i++){
            neuronList[i].createSynapses(r,i,neuronList);
       }
    }
    
   static double getMu(){
        return mu;
    }
    
   static Neuron[] getNeuronList(){
        return neuronList;
    }
    
    public Network(int numberOfNeurons, int r, double mu) {
        this.numberOfNeurons = numberOfNeurons;
        this.r = r;
        this.mu = mu;
        this.neuronList = new Neuron[numberOfNeurons];
    }

    
}


