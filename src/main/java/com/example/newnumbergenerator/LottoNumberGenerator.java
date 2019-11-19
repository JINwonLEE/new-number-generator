package com.example.newnumbergenerator;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;

@Controller
public class LottoNumberGenerator {

	@Autowired
    private LottoNumberGeneratorService lottoNumberGeneratorService;

	@RequestMapping("/lotto-number-generator")
    public String lottoMainPage(Model model) {
        String result = "lottoMain";

		ArrayList<String> numberList = this.generateLottoNumbers();
        model.addAttribute("numbers", numberList);

        return result;
    }

	public ArrayList<String> generateLottoNumbers() {
		ArrayList<String> numberList = lottoNumberGeneratorService.generateLottoNumbers();

		return numberList;
	}

}
