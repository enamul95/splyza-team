package com.splyzateam.serviceImpl;

import com.splyzateam.common.Constrants;
import com.splyzateam.entity.InviteEntity;
import com.splyzateam.entity.TeamsEntity;
import com.splyzateam.repository.InviteServiceRepository;
import com.splyzateam.service.InviteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class InviteServiceImpl implements InviteService {
    @Autowired
    InviteServiceRepository inviteServiceRepository;


    @Override
    public InviteEntity save(InviteEntity inviteEntity) {
        inviteEntity.setUrl(Constrants.base_url+getUrlEnd());
        return inviteServiceRepository.save(inviteEntity);
    }


    public String getUrlEnd(){

        char[] chars = new char[]{ 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };

        Random rnd = new Random();
        int charsLength = chars.length;
        int len = 8;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < len; i++)
        {
            int index = rnd.nextInt(charsLength - i - 1);
            // Simple swap
            char a = chars[i + index];
            chars[i + index] = chars[i];
            chars[i] = a;
            stringBuilder.append(a);
        }
        return stringBuilder.toString().toUpperCase();
    }
}
