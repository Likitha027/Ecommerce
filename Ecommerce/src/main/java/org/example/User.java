package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter@Getter@AllArgsConstructor@NoArgsConstructor
public class User
{
    String UserName;
    Integer MobileNum;
    String EmailId;
    String Address;
    String Password;
}
