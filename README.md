![Image description](https://i1.faceprep.in/ProGrad/face-logo-resized.png)

# ProGrad Lab | ProGrad Premier League


## Progression 1:

Create `Main.java` with main method 
Create skill class with below attributes, 
• skillld - Long 
• skillName - String 
Include getter and setter method for all the attributes 
Include a constructor with below arguments, 
`public skill(skillld,skillName)` 


## Progression 2:

Create `skilIDAO` class with below method, 
`public TreeMap<skill,lnteger> skillCount()` - Method used to retrieve number of players having particular skill. 
```
Hint skillCount() method returns a map with key as skill type and value as number of players in that skill. Use TreeMap to store the values in alpabetical order. 
```


![1 2](https://user-images.githubusercontent.com/61002120/76416050-5807d380-63c0-11ea-8d52-9e8750e800f9.png)


### Note:

Use the below code to retreive the connection details from mysql.properties to establish connection
```
public static Properties loadPropertiesFile() throws Exception {
	Properties prop = new Properties();	
	InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
	prop.load(in);
	in.close(); 
	return prop;
}
```    
**Sample Output**
```
Skill 			Players 
All Rounder 		35 
Batting 		31 
Bowling 		27 
Wicket Keeping Batting 	4 
```
