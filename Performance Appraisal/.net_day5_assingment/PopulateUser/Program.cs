using BOL;

using System.Reflection;
using System.Collections.Generic;
using System.IO;
using System.Text.Json;
using System.Text.Json.Serialization;


User user1 = new User(101,"Abhishek",35000,"Developer",102,"Akurdi","abhishek@gmail.com");
User user2 = new User(102,"Sagar",40000,"HR",103,"Hinjewadi","sagar@gmail.com");
User user3 = new User(103,"Sharayu",50000,"BOD",0,"Camp","shrayu@gmail.com");

List<User> userlist = new List<User>();

userlist.Add(user1);
userlist.Add(user2);
userlist.Add(user3);

Console.WriteLine("Enter fully qualified address for folder storing serialised file.");
string location= Console.ReadLine();
location= location+"\\User.json";
string fileName=@location;

            try{
            var options=new JsonSerializerOptions {IncludeFields=true};
            var UserJson=JsonSerializer.Serialize<List<User>>(userlist,options);
            File.WriteAllText(fileName,UserJson);
            }   

            catch(Exception exp){}
            finally{}
