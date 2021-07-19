package singleton

// this code won't run because class has a @singleton clause on it - this is run on a public class
/*
DatabaseConnection dbConnection = new DatabaseConnection()
println dbConnection
*/

// the following will run since it's on a private class

DatabaseConnection db = DatabaseConnection.instance         // running on a private instance
println db

