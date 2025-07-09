package interview_preparation;

public class TechnicalQuestions {

    public static void main(String[] args){

        /*

        Q) What is the space complexity of the recursive implementation of the merge sort?
        ---> O(n)
        The space complexity of merge sort is the sum of  space complexity of merging procedure.

        Q) SQL Query :-
           SELECT department, COUNT(*) AS employee_count
           FROM employees
           WHERE department IS NOT NULL
           GROUP BY department
           HAVING COUNT(*) > 1;

         ---> Departments with more than one employee, excluding departments with null values.

         Q) SQL Query :-
            SELECT e.name AS employee_name, d.name AS department_name
            FROM employee e
            LEFT JOIN department d
            ON e.department_id = d.id
            WHERE d.name IS NULL;

         --->

         Q) Which of the following is true for semaphore?
         1. They are used to manage shared resources between processes.
         2. They can not be used for synchronization.
         3. Semaphore are always initialized to zero.
         4. They do not have any relation to process scheduling.

         --->  They are used to manage shared resources between processes.

         Q) Communication in Microservice architecture
         In a microservice architecture, Service A needs to communicate with service B to fetch some data.
         The system is designed to be highly scalable and loosely coupled. Which of the following communication
         methods would be the best choice for service A to call service B in such an environment?

         1. Direct synchronous HTTP REST call, where service A waits for a response from service B.
         2. Direct synchronous HTTP REST call, where service B responds asynchronously after a delay.
         3. Asynchronous message-based communication using a message broker (e.g. RabbitMQ, Kafka) to decouple the services.
         4. Direct database access, where service A directly accesses service B's database to retrieve the data.

         ---> Asynchronous message-based communication using a message broker (e.g. RabbitMQ, Kafka) to decouple the services.
         B'coz,
         Scalable -
         services scale independently. Service a can send message to a queue or topic without waiting for an immediate response.
         and service B can process messages when it is ready.

         Loose coupling -
         Service A just the message to service B. It doesn't need to know the state or availibility of service B.

         Q) Which of the following types of joins will return rows when there is a match in either left table or right table
         but not necessarily both?

         1. INNER JOIN
         2. LEFT JOIN
         3. RIGHT JOIN
         4. FULL OUTER JOIN

         ---> FULL OUTER JOIN
         FULL OUTER JOIN returns all rows from both left and right tables. and it combines matching rows from both the tables.

         Q) What will happen if you try to instantiate an abstract class in java?
         ---> Compilation error: cannot instantiate an abstract class directly.

         Q)











         */

    }

}
