# Design Pattern - Java

This repo is a group of sample code, implementation from all chapters presented in <i>"Head First Design Patterns"</i> book. 
The language used in this repository is <b>Java</b>.

<b>Design Pattern</b> is a general reusable solution to a commonly occurring problem within a given context in software design.

<h4>Why using design pattern?</h4>
<ul>
<li>Shared pattern vocabularies. If you communicate in patterns, then other developers know immediately and precisely the design you're describing.</li>
<li>Patterns allow you to say more with less. Other developers quickly know precisely the design you have in mind.</li>
<li>A team well versed in design pattern can move quickly with less room.</li>
<li>Easier to maintain in the future and hand over the code to other developer.</li>
</ul>

Based on <i>"Gang of Four (GoF)"</i>, design pattern divided into 3 type characteristics, there are :

<h3>Structural</h3>
<ol>

<li>Adapter Pattern</li>
<ul>
<li>Converts the interface into one a clients expects.</li>
<li>Act as the middleman by receiving request from client and converting them into request that make sense on the vendor classes.</li>
<li>Adapter implement adaptee interface.</li>
</ul>

<li>Composite Pattern</li>
<ul>
<li>Compose objects into tree structures to represents part-whole hierarchies.</li>
<li>Treat collections of objects and individual objects (node and leaf) uniformly.</li>
</ul>

<li>Decorator Pattern</li>
<ul>
<li>Classes should be open for extension, but closed for  modification.</li>
<li>Easily extended to incorporate new behavior without modifying existing code.</li>
<li>Wrap/decorate object with new behavior dinamically at runtime.</li>
<li>Decorators have the same supertype as the objects they decorate.</li>
</ul>

<li>Facade Pattern</li>
<ul>
<li>Simplify interface to their functionality.</li>
<li>Provides a unified interface to a set of interface in a subsystem.</li>
<li>Decouples a client from a complex subsystem.</li>
</ul>

<li>Proxy Pattern</li>
<ul>
<li>Wraps another object to control and manage access.</li>
<li>Remote Proxy - manages interaction between a client and remote object.</li>
<li>Virtual Proxy - proxy creates the real subject when it's needed.</li>
<li>Protection Proxy - controls access to an object based on access rights.</li>
</ul>

</ol>

<h3>Behavioral</h3>
<ol>

<li>Command Pattern</li>
<ul>
<li>Encapsulate method invocation or request as an object.</li>
<li>Invokers can be parameterized with Commands, even dynamically at runtime.</li>
<li>Support logging, queue or implement undo operation.</li>
<li>Queue, give an effective way to limit computation to foxed number of thread.</li>
<li>Allow macro command which can invoke multiple commands.</li>
</ul>

<li>Iterator Pattern</li>
<ul>
<li>Allows access to an aggregate's element without exposing its internal structure.</li>
<li>Implement iterator interface for all collection.</li>
</ul>

<li>Observer Pattern</li>
<ul>
<li>Publisher + Subscriber, Holywood principle.</li>
<li>One-to-many dependency between object.</li>
<li>When one object changes state, all of its dependents are notified and updated automatically.</li>
<li>Loosely coupled designs, Publisher don't care about concrete Subscriber/Observer, it will always notify any object that implements Subscriber/Observer interface.</li>
</ul>

<li>State Pattern</li>
<ul>
<li>Allows an object to have many different behaviors that are based on its internal state.</li>
<li>Localized the behavior of each state into its own class.</li>
<li>Closed each state for modification.</li>
</ul>

<li>Strategy Pattern</li>
<ul>
<li>Favor composition over inheritance and lets selected family of algorithm at runtime.</li>
<li>Program to an interface, not an implementation.</li>
<li>Separate class that implement a particular behavior interface.</li>
<li>Lets the algorithm vary independently from clients that use it.</li>
</ul>

<li>Template Method Pattern</li>
<ul>
<li>Defines the skeleton of an algorithm.</li>
<li>Let subclasses redefine certain steps of an algorithm without changing the algorithm's structure.</li>
<li>Maximizes code reuse among the subclasses.</li>
</ul>

</ol>

<h3>Creational</h3>
<ol>

<li>Abstract Factory Pattern</li>
<ul>
<li>Provide an interface for creating a family of products related objects without having to depend on their concrete classes.</li>
<li>Decouple code from the actual factory.</li>
<li>Create objects through object composition.</li>
</ul>

<li>Factory Method Pattern</li>
<ul>
<li>Encapsulates object creation by letting subclasses decide what object to create.</li>
<li>Makes the code more flexible and extensible in the future.</li>
<li>Depend upon abstractions. Do not depend upon concrete classes.</li>
<li>Create objects through inheritance.</li>
</ul>

<li>Singleton Pattern</li>
<ul>
<li>Creating one-of-a-kind objects for which there is only one instance.</li>
<li>Use static variable and unique.</li>
<li>Use private constructor.</li>
<li>Provides a global point of access to it.</li>
</ul>

</ol>

<h4>Compound Pattern</h4>
<li>Combines two or  more patterns into a solution that solves a recurring or general problem.</li>
<li>Sample of compound pattern is MVC, MVP and MVVM.</li>
