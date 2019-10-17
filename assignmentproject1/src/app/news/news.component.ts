import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.css']
})
export class NewsComponent implements OnInit {

  newsData: any='';
     newss=[
       {
         brand:'Meet the giant parrots that lived 19 million years ago',
         img: 'https://www.thehindu.com/sci-tech/science/ki59bf/article28871879.ece/ALTERNATES/FREE_960/8TH-PARROT',
         description:'The remains of a super-sized parrot that stood more than half the height of an average human and roamed the Earth 19 million years ago have been discovered in New Zealand. Judging by the size of the leg bones, the bird would have stood about one metre tall and weighed up to seven kg, according to a report by an international team of palaeontologists published in the latest edition of Biology Letters.“It could have flown but we’re putting our money on it being flightless,” said Paul Scofield, the senior curator of natural history at Canterbury Museum.'
       },
       {
        brand:'Ocean warming, overfishing increase methylmercury toxin in fish',
        img: 'https://www.thehindu.com/sci-tech/science/dzlqel/article28873070.ece/ALTERNATES/FREE_960/VBK-OCEANWARMING-AP',
        description:'The researchers warn that human exposure to the toxin through fish consumption is bound to increase as a result of climate change.  Despite a decrease in seawater concentration of methylmercury since the late 1990s, the amount of toxin that gets accumulated in certain fish which are higher in the food chain have been found to increase. The amount of methylmercury in fish higher in the food chain can change due to two reasons — ocean warming and dietary shifts due to overfishing by humans.  Based on 30 years (1970s and 2000s) of data and ecosystem modelling, researchers have found that there has been up to 23% increase in methylmercury concentration in Atlantic cod fish in the Gulf of Maine in the northwestern Atlantic Ocean.'
      },
      {
        brand:'Samsung unveils super productive Galaxy Note10 smartphones',
        img: 'https://www.thehindu.com/sci-tech/technology/gadgets/5526ud/article28874063.ece/ALTERNATES/FREE_960/VBK-SAMSUNG-GALAXY-NOTE10-AP',
        description:'The 6.3-inch FHD+ Galaxy Note10 houses 8GB RAM with 256GB internal storage (4G model) while 12GB RAM with 256GB internal storage will be 5G-ready. Taking productivity and creativity to the next level, Samsung has unveiled its most powerful line-up of Galaxy Note10 smartphones with an enhanced S (Stylus) Pen experience. The 6.3-inch FHD+ Galaxy Note10 houses 8GB RAM with 256GB internal storage (4G model) while 12GB RAM with 256GB internal storage will be 5G-ready. The Galaxy Note 10+ has a mammoth 12GB RAM (with 256GB internal storage) and another 5G-ready variant of 12GB RAM with 512GB internal storage (expandable up to 1TB).'
      },
      {
        brand:'Marginalised kids get a voice through film',
        img: 'https://www.thehindu.com/news/cities/mumbai/56mycf/article28873822.ece/ALTERNATES/FREE_960/08BM-india-alive-film-fest-2',
        description:'Short films made by 65 children showcased at India Alive Short Film Festival  Altogether 11 short films, made by 65 underprivileged and marginalised children, were showcased as a part of the India Alive Short Film Festival on Wednesday. The films were screened in the presence of some of the leading artistes from the film industry. The India Alive Short Film Festival, organised by Film Bug, a non-profit organisation founded by Nameeta Premkumar and Kapil Mattoo, teaches filmmaking to underprivileged children through workshops across the country.  In the past one year, six workshops were held in various towns including Shivpuri, Satara, Jaipur and Bengaluru. “Filmbug is designed to encourage children to think out of the box, to work in teams, to give vent to their emotions, help them gain confidence, empower them to tell their stories through film and to enjoy an immersive movie-making experience,” the organisation said in a statement.'
      },
      {
        brand:'Rocket Lab working on a reusable booster',
        img: 'https://www.thehindu.com/sci-tech/technology/e5oxoc/article28872507.ece/ALTERNATES/FREE_960/8TH-ROCKET',
        description:'If successful, it would make it the second company after Elon Musk’s SpaceX to reuse an orbital-class rocket booster. Small-satellite launch firm Rocket Lab plans to recover the core booster of its Electron rocket using a helicopter, a bold cost-saving concept that, if successful, would make it the second company after Elon Musk’s SpaceX to reuse an orbital-class rocket booster.Electron is going reusable,” Rocket Lab chief executive Peter Beck said during a presentation in Utah, showing an animation of the rocket sending a payload into a shallow orbit before speeding back through Earth’s atmosphere. The Auckland-based company is one of a growing cadre of launch companies looking to slash the cost of sending shoebox-sized satellites to low Earth orbit, building smaller rockets and reinventing traditional production lines to meet a growing payload demand.'
      },
      {
        brand:'Mexico’s cactus offers alternative to plastics',
        img: 'https://www.thehindu.com/sci-tech/energy-and-environment/syooz5/article28871810.ece/ALTERNATES/FREE_960/8TH-CACTUS',
        description:'The pulp of the prickly pear is mixed with additives to produce sheets that can be used for packaging. Mexico’s prickly pear cactus, which is emblazoned on the country’s flag, could soon play a new and innovative role in the production of biodegradable plastics. A packaging material that is made from the plant has been developed by a Mexican researcher and is offering a promising solution to one of the world’s biggest pollution conundrums. “The pulp is strained to obtain a juice that I then use,” said Sandra Pascoe, who developed the product and works at the Atemajac Valley University in the western city of Guadalajara.'
        
        
      },
      {
        brand:'Gazans struggle to protect antiquities',
        img: 'https://www.thehindu.com/society/history-and-culture/m9j2s9/article28872419.ece/ALTERNATES/FREE_960/8TH-GAZA2',
        description:'Plundering and trafficking of artefacts is rampant in the territory under seige.  Walid al-Aqqad’s Gaza home would be the envy of many an antiquities collector. Pieces of Corinthian columns greet visitors in the backyard. Inside, hundreds of ancient pots and other artefacts hang on the walls or are arranged helter-skelter on shelves. They are remnants of five millennia of Gaza’s history, from the Bronze Age to the Islamic caliphates and on down to the years of Ottoman and British rule in the 20th century.  A sliver of land on the Mediterranean, Gaza was a major trade route between Egypt and the Levant going back to ancient times. But decades of uprisings, war and political turmoil have inflicted a heavy toll on its rich archaeological heritage, exposing it to looting and destruction.'
      },
      {
        brand:'China to boycott cinema awards in Taiwan',
        img: 'https://www.thehindu.com/news/international/1hjcwy/article28872537.ece/ALTERNATES/FREE_460/8TH-GOLDEN',
        description:'Mainland films, actors and filmmakers have been banned from participating in the ceremony  China’s national film board on Wednesday ordered mainland directors and stars to boycott Asia’s top cinema awards in Taiwan, as relations between Beijing and the self-ruled democratic island worsen. Taiwan’s Golden Horse Awards, dubbed the “Chinese Oscars,” ran into trouble with mainland authorities last year after a Taiwanese winner called for the island’s independence in an acceptance speech. Beijing sees Taiwan as part of its territory awaiting unification, even though the two sides have been ruled separately since the end of a civil war in 1949.'
      },
      {
        brand:'Sushma Swaraj was just ‘a phone call away’ for families of Indians killed in Iraq',
        img: 'https://www.thehindu.com/news/national/odnp44/article28864088.ece/ALTERNATES/FREE_960/SYSHMAIRAQK',
        description:'Swaraj, the then External Affairs Minister, had worked painstakingly for four years to find the whereabouts of 39 Indian workers who were abducted and killed by ISIS militants in Iraq in 2014  “She spared no effort in finding our dear ones,” said Gurpinder Kaur on Wednesday, recalling how as External Affairs Minister, Sushma Swaraj had worked painstakingly for four years to find the whereabouts of 39 Indian workers who were abducted and killed by ISIS militants in Iraq in 2014.  The families say Swaraj was a constant source of support and helped them bring back the mortal remains of their loved ones which finally gave them closure. “Otherwise we would have waited our whole life to know about their fate,” Ms. Kaur, whose 26-year-old brother Manjinder Singh was among the victims, said while paying tributes to Swaraj.'
      },
      {
        brand:'Is Jammu and Kashmir underdeveloped as stated by Amit Shah?',
        img: 'https://www.thehindu.com/news/national/other-states/n668wb/article28855696.ece/ALTERNATES/FREE_960/JAMMUKBDP',
        description:'Where does Jammu and Kashmir stand in comparison to other States in key indicators of growth and development Union Home Minister Amit Shah has linked poor healthcare, poverty, lack of doctors and slow economic growth in Jammu and Kashmir to amendment to Article 370. However, a look at how the State, now bifurcated into Union Territories, compares with other States in key indicators suggests that these concerns are exaggerated. Life expectancy Jammu and Kashmir ranked third out of 22 States in terms of life expectancy. The former State had an average life expectancy of 73.5 between 2012-16. Kerala had the highest life expectancy of 75.1, while Uttar Pradesh had the lowest (64.8). The national average was 68.7.'
      }
     
     
     
     
     
     
      
     ]
  constructor() { }
    
  ngOnInit() {
  }
  sendNews(news){
    this.newsData=news;
    console.log(news);
  }

}
