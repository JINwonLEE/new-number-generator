package com.example.newnumbergenerator;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class LottoNumberGeneratorService {

    int MAX_VOLUME = 6;
    int MAX_NUM = 45;
	String GEN_SERVICE = "Generate";

	@Autowired
    private LottoNumberRepository lottoNumberRepository;

	public ArrayList<String> generateLottoNumbers() {
        Random randomGenerator = new Random();
		String numberToString = "";
		ArrayList<String> numberList = new ArrayList<String>();
		while (numberList.size() != MAX_VOLUME) {
            int randomNumber = randomGenerator.nextInt(MAX_NUM) + 1;
            if (!numberList.contains(randomNumber)) {
                    numberList.add(Integer.toString(randomNumber));
            }
        }

		for (String number : numberList) {
			numberToString += number + "\t";	
		}


		LottoNumber data = new LottoNumber();
		data.setService(GEN_SERVICE);
		data.setNumbers(numberToString);

		lottoNumberRepository.save(data);

		//model.addAttribute("numbers", numberList);

		return numberList;
	}

}

