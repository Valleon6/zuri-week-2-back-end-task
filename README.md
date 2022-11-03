# zuri-week-2-back-end-task
Task Description Using the same server setup from stage one Create an (POST) api endpoint
that takes the following sample json: 

{ “operation_type”: Enum <addition | subtraction | multiplication> , “x”: Integer, “y”: Integer }

Operation can either be addition, subtraction or multiplication x can be a number
and Integer datatype y can be a number and Integer datatype Based on the operation sent, 

perform a simple arithmetic operation on x and y Return a response with the result of the operation and your slack username 

{ “slackUsername”: String, "operation_type" : Enum. value, “result”: Integer }

Push to GitHub Sample Input 

{ “operation_type”: Enum <addition | subtraction | multiplication>, “x”: Integer, “y”: Integer }

Sample Response Format { “slackUsername”: String, “result”: Integer, “operation_type”: Enum.value }