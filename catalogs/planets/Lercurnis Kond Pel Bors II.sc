DwarfMoon	"Bors II/Lercurnis B VII B-II"
{
	ParentBody     "Pel"
	Class          "Terra"
	Mass            0.000119999997
	Radius          335.119995
	InertiaMoment   0.399419993
	Obliquity       -2
	EqAscendNode    8.24427481
	TidalLocked     true

	Albedo          0.9
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_kond_pel_bors_ii.cfg"
		SurfStyle       0.913
		Randomize      (-0.223, 0.915, 0.410)
		colorDistMagn   0.073
		colorDistFreq   45.3
		detailScale     128
		drivenDarkening 0
		seaLevel        0.0992
		snowLevel       2
		tropicLatitude  0.0175
		icecapLatitude  2
		icecapHeight    0.653
		climatePole     0.438
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.333
		heightTempGrad  0.625
		beachWidth      0.00102
		tropicWidth     0.07
		mainFreq        1.34
		venusFreq       1.66
		venusMagn       1.37
		mareFreq        0.001
		mareDensity     0
		terraceProb     0.412
		erosion         0
		montesMagn      0.01
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.0266
		dunesFreq       2.44
		dunesFraction   0.0683
		hillsMagn       1
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      60.7
		riversFreq      4.13
		riversSin       5.63
		riftsMagn       60.9
		riftsFreq       2.6
		riftsSin        5.98
		eqridgeMagn     0.107
		eqridgeWidth    1
		eqridgeModMagn  2.5
		eqridgeModFreq  3.28
		canyonsMagn     0.471
		canyonsFreq     0.0972
		canyonsFraction 0.104
		cracksMagn      0
		cracksFreq      15
		cracksOctaves   15
		craterMagn      0.4
		craterFreq      2
		craterDensity   0.962
		craterOctaves   30
		craterRayedFactor 0.595
		volcanoMagn     0
		volcanoFreq     0.595
		volcanoDensity  0.313
		volcanoOctaves  5
		volcanoActivity 2
		volcanoFlows    1
		volcanoRadius   0.0534
		volcanoTemp     1.92e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      16.8
		SpecBrightWater 0
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      9.55830576
		SemiMajorAxisKm 1391609.21
		Eccentricity    0.12
		Inclination     -2
		AscendingNode   8.24427481
		ArgOfPericenter 173.129771
		MeanAnomaly     134.656489
	}
}

