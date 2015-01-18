/*
 * Copyright © 2015 Ajay Bhatia <prof.ajaybhatia@gmail.com>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package com.ajaybhatia.dashavatara.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;

import com.ajaybhatia.dashavatara.R;

/**
 * Created by ajay on 18/1/15.
 */
public class DescriptionFragment extends Fragment {

    private static final String[] DESCRIPTIONS = {
            "<html><body><p style='text-align:justify'><span style='display: inline; padding: 20px'></span><b>Matsya</b>, the fish, from the Satya Yuga. Vishnu takes the form of a fish to save Manu from apocalypse, after which he takes his boat to the new world along with one of every species of plant and animal, gathered in a massive cyclone.</p></body></html>",
            "<html><body><p style='text-align:justify'><span style='display: inline; padding: 20px'></span><b>Kurma</b>, the tortoise, from the Satya Yuga. When the devas and asuras were churning the Ocean of milk in order to get amrita, the nectar of immortality, the mount Mandara they were using as the churning staff started to sink and Vishnu took the form of a tortoise to bear the weight of the mountain.</p></body></html>",
            "<html><body><p style='text-align:justify'><span style='display: inline; padding: 20px'></span><b>Varaha</b>, the boar, from the Satya Yuga. He appeared to defeat Hiranyaksha, a demon who had taken the Earth, or Prithvi, and carried it to the bottom of what is described as the cosmic ocean in the story. The battle between Varaha and Hiranyaksha is believed to have lasted for a thousand years, which the former finally won. Varaha carried the Earth out of the ocean between his tusks and restored it to its place in the universe</p></body></html>",
            "<html><body><p style='text-align:justify'><span style='display: inline; padding: 20px'></span><b>Narasimha</b>, the half-man/half-lion, from the Satya Yuga. The rakshasa (An evil person) Hiranyakashipu, the elder brother of Hiranyaksha, was granted a powerful boon from Brahma, not allowing him to be killed by man or animal, inside or out, day or night, on earth or the stars, with a weapon either living or inanimate. Vishnu descended as an anthropomorphic incarnation, with the body of a man and head and claws of a lion. He then disembowels the rakshasa at the courtyard threshold of his house, at dusk, with his claws, while he lay on his thighs.</p></body></html>",
            "<html><body><p style='text-align:justify'><span style='display: inline; padding: 20px'></span><b>Vamana</b>, the dwarf, from the Treta Yuga. The fourth descendant of Hiranyakashyap, Bali, with devotion and penance was able to defeat Indra, the god of firmament. This humbled the other deities and extended his authority over the three worlds. The gods appealed to Vishnu for protection and he descended as the dwarf Vamana. During a yajna of the king, Vamana approached him and Bali promised him for whatever he asked. Vamana asked for three paces of land. Bali agreed, and the dwarf then changed his size to that of a giant. He stepped over heaven in his first stride, and the netherworld with the second. Bali realized that Vamana was Vishnu incarnate. In deference, the king offered his head as the third place for Vamana to place his foot. The avatar did so and thus granted Bali immortality. Then in appreciation to Bali and his grandfather Prahlada, Vamana made him ruler of Pathala, the netherworld.</p></body></html>",
            "<html><body><p style='text-align:justify'><span style='display: inline; padding: 20px'></span><b>Parashurama</b>, warrior with the axe, from the Treta Yuga. He is son of Jamadagni and Renuka and received an axe after a penance to Shiva. He is the first Brahmin-Kshatriya in Hinduism, or warrior-saint, with duties between a Brahmana and a Kshatriya). King Kartavirya Arjuna and his army visited the father of Parashurama at his ashram, and the saint was able to feed them with the divine cow Kamadhenu. The king demanded the animal, Jamadagni refused, and the king took it by force and destroyed the ashram. Parashurama then killed the king at his palace and destroyed his army. In revenge, the sons of Kartavirya killed Jamadagni. Parashurama took a vow to kill every Kshatriya on earth twenty-one times over, and filled five lakes with their blood. Ultimately, his grandfather, rishi Rucheeka, appeared and made him halt. He is a Chiranjivi (immortal), and believed to be alive today in penance at Mahendragiri.</p></body></html>",
            "<html><body><p style='text-align:justify'><span style='display: inline; padding: 20px'></span><b>Rama</b>, the prince and king of Ayodhya, from the Treta Yuga. He is a commonly worshiped avatar in Hinduism, and is thought of as the ideal heroic man. His story is recounted in one of the most widely read scriptures of Hinduism, the Ramayana. While in exile from his own kingdom with his brother Lakshman and the monkey king Hanuman, his wife Sita was abducted by the demon king of Lanka, Ravana. He travelled to Ashoka Vatika in Lanka, killed the demon king and saved Sita.</p></body></html>",
            "<html><body><p style='text-align:justify'><span style='display: inline; padding: 20px'></span><b>Krishna</b> was the eighth son of Devaki and Vasudev, from the Dwapara Yuga. He is also a frequently worshiped deity in Hinduism and an avatar in Vaishnava belief. He appeared alongside his elder brother Balarama. Balarama is regarded generally as an avatar of Shesha. However, Balarama is included as the eighth avatar of Vishnu in the Sri Vaishnava lists, where Buddha is omitted and Krishna appears as the ninth avatar in this list. He particularly included in the lists, where Krishna is removed and becomes the source of all avatars.</p></body></html>",
            "<html><body><p style='text-align:justify'><span style='display: inline; padding: 20px'></span><b>Buddha</b>: Gautama Buddha, the founder of Buddhism, is generally included as an avatar of Vishnu in Hinduism. Buddha may be depicted in Hindu scriptures as a preacher who deludes and leads demons and heretics away from the path of the Vedic scriptures. Another view praises him as a compassionate teacher who preached the path of ahimsa (non-violence).</p></body></html>",
            "<html><body><p style='text-align:justify'><span style='display: inline; padding: 20px'></span><b>Kalki</b> (\"Eternity\", or \"White Horse\", or \"Destroyer of Filth\"), will be the final incarnation of Vishnu, foretold to appear at the end of Kali Yuga, our present epoch. He will be atop a white horse and his sword will be drawn, blazing like a comet. He is the harbinger of end time in Hindu eschatology, and will destroy all unrighteousness and evil at the end of Kali Yuga.</p></body></html>",
    };

    private static final int[] PICTURES = {
            R.drawable.avatar01,
            R.drawable.avatar02,
            R.drawable.avatar03,
            R.drawable.avatar04,
            R.drawable.avatar05,
            R.drawable.avatar06,
            R.drawable.avatar07,
            R.drawable.avatar08,
            R.drawable.avatar09,
            R.drawable.avatar10,
    };

    private ImageView imageView;
    private WebView webView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_desc, container, false);

        imageView = (ImageView) view.findViewById(R.id.image);
        webView = (WebView) view.findViewById(R.id.webview);

        return view;
    }

    public void setPosition(int position) {
        imageView.setImageResource(PICTURES[position]);
        webView.loadDataWithBaseURL(null, DESCRIPTIONS[position], "text/html", "utf-8", null);
    }
}
