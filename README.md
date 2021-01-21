# Neuron-simulator
Implementation of a neuron simulator in Java created during class. The application initializes the potential of a set of neurons and their connections (neighbors of each neuron). It will then calculate 
the potential of each neuron during successive time steps. The task is to successfully simulate the network so that it reaches the threshold potential and start forming the spikes observed
in the real life neuron networks.


# How to run
1. Use Netbeans to run the project.
2. The number of neurons and the number of neighbors are freely chosen by the user, however, the neighbors cannot be more than half the number of the total neurons.
3. Give it some time. Depending on the number of neurons and neighbors, the spiking may take a while in order to occur. A network of 320 neurons with 140 associated neighbors takes 
up to 5 minutes to create the spikes.

# Example images of the simulation

1. Starting the simulation
<img src="/java screens/start.PNG"></img>

2. Neurons moving towards threshold
<img src="/java screens/middle.PNG"></img>

3. Spikes start to appear
<img src="/java screens/more spiking.PNG"></img>

4. Final spike pattern
<img src="/java screens/end.PNG"></img>
