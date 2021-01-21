/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neuronsimulator;

import java.util.ArrayList;

/**
 * @param u the potential u 
 * @param the place of the neuron in the list of neurons
 * @param influenceList the list contains all the neighbors of the neuron
 * @param synapseList the list contains the synapses the neuron has with each of his neighbors
 * 
 */
public class Neuron {
    
    double u; //potential
    int place;//place in the array
    ArrayList<Neuron> influenceList = new ArrayList<Neuron>();//neighboring neurons
    ArrayList<Synapse> synapseList = new  ArrayList<Synapse>();
    
   
         /**defines neighbors for each neuron, and then creates synapses for each 
          * neighbor
        */
   public void createSynapses(int r, int neuron, Neuron[] neuronList){
        if (neuron+r<neuronList.length-1){
            for (int i=1;i<=r;i++){
             neuronList[neuron].influenceList.add(neuronList[neuron+i]);
            }
        }else{
            int difference = neuronList.length-neuron;
            
            /**if the array has to cycle, the remaining elements of the until the end are added, and the 
            *we count from zero to find the rest
             */
           
            for (int i=0;i<=r-difference;i++){
              neuronList[neuron].influenceList.add(neuronList[i]);
            }
            for (int i=1;i<difference;i++){
             neuronList[neuron].influenceList.add(neuronList[neuron+i]);   
            }
        } 
        //left neighbors
        if (neuron-r>0){  
            for (int i=1;i<=r;i++){
                neuronList[neuron].influenceList.add(neuronList[neuron-i]); 
            }
        }else{
            //if the arrray has to cycle, the remaining elements of the until the end are added, and the 
           //we count from zero to find the rest
           int difference = r - neuron;
           for (int i=1;i<=neuron;i++){
               //check if the neuron already exists in the list
               if (!neuronList[neuron].influenceList.contains(neuronList[neuron-i])){
                neuronList[neuron].influenceList.add(neuronList[neuron-i]);   
               }             
           }
           for (int i=1;i<=difference;i++){
               //check if the neuron already exists in the list
               if (!neuronList[neuron].influenceList.contains(neuronList[neuronList.length-i])){
                    neuronList[neuron].influenceList.add(neuronList[neuronList.length-i]);
               }         
           }
        }
        //create synapses and add them to the synapse list
        for (Neuron n: neuronList[neuron].influenceList) {
            neuronList[neuron].synapseList.add(new Synapse(neuronList[neuron],n,0.7));
        // System.out.println("Created synapse from neuron " + this.place+ " to neuron "+n.place);
        }
        
    }
    
 
    double calculateNewPotential(double mu){
      double sum = 0;
      double newU=0;
      //calculates the sum of all sysapses and takes the average
      for (int i=0;i<this.synapseList.size();i++){
          sum+=synapseList.get(i).calculateNewUValue();      
      }
      sum = sum /synapseList.size();
      //equation
      newU= this.u + 0.0001*(mu - this.u + sum);   
      return newU;     
    }
    
    void updateU(double u){
        if (u>0.98){
            this.u=0;
        }else{
            this.u=u;
        }
    }
   
    public Neuron (double u,int place){
        this.u=u;
        this.place=place;
    }
}
