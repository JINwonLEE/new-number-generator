package com.example.newnumbergenerator;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;

@Controller
public class LottoNumberGenerator {
    int MAX_VOLUME = 6;
    int MAX_NUM = 45;
	String GEN_SERVICE = "Generate";

    @Autowired
    private LottoNumberRepository lottoNumberRepository;

	@RequestMapping("/lotto-number-generator")
    public String lottoMainPage(Model model) {
        String result = "lottoMain";
        Random randomGenerator = new Random();
        ArrayList<String> numberList = new ArrayList<String>();
		String numberToString = "";

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

        model.addAttribute("numbers", numberList);

        return result;
    }

    //@RequestMapping(value="/lotto-number-generator/get-lotto-numbers")
    @RequestMapping(value="/get-lotto-numbers")
    public String generateLottoNumber(Model model) {
        String result = "lottoNumberGet";
        Random randomGenerator = new Random();
        ArrayList<String> numberList = new ArrayList<String>();

        while (numberList.size() != MAX_VOLUME) {
            int randomNumber = randomGenerator.nextInt(MAX_NUM) + 1;
            if (!numberList.contains(randomNumber)) {
                    numberList.add(Integer.toString(randomNumber));
            }
        }

        model.addAttribute("numbers", numberList);

        return result;
    }
}
