Moon	"Ou/Caecus III I"
{
	ParentBody     "Oktdek"
	Class          "Terra"
	Mass            0.015
	Radius          1.72e+03
	InertiaMoment   0.371
	Oblateness      0.00162
	Obliquity       0.0001
	EqAscendNode    63.2
	TidalLocked     true

	EndogenousHeating 19
	AlbedoBond      0.07
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Interior
	{
		Composition
		{
			Silicates	80
			Metals		20
		}
	}

	Surface
	{
		Preset         "caecus_oktdek_ou.cfg"
		SurfStyle       0.917
		Randomize      (-0.719, 0.653, -0.356)
		colorDistMagn   0.0404
		colorDistFreq   199
		detailScale     128
		drivenDarkening 0
		seaLevel        0.0992
		snowLevel       2
		tropicLatitude  0.0299
		icecapLatitude  2
		icecapHeight    0.0212
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.237
		heightTempGrad  0.625
		beachWidth      0.000701
		tropicWidth     0.07
		mainFreq        1.67
		venusFreq       2
		venusMagn       1.56
		mareFreq        0.3
		mareDensity     0.183
		terraceProb     0.328
		erosion         0
		montesMagn      0.1
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.037
		dunesFreq       18.8
		dunesFraction   0.0362
		hillsMagn       1.5
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      55.9
		riversFreq      4.23
		riversSin       5.77
		riftsMagn       15
		riftsFreq       10
		riftsSin        10
		eqridgeMagn     0.0687
		eqridgeWidth    1
		eqridgeModMagn  1.41
		eqridgeModFreq  10
		canyonsMagn     0.438
		canyonsFreq     0.655
		canyonsFraction 0
		cracksMagn      0.03
		cracksFreq      0.2
		cracksOctaves   15
		craterMagn      0.5
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0
		volcanoMagn     0.35
		volcanoFreq     1.14
		volcanoDensity  0.168
		volcanoOctaves  5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.443
		volcanoTemp     0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      45
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
		PeriodDays      1.76920486
		SemiMajorAxisKm 421700
		Eccentricity    0.0001
		Inclination     0.0001
		AscendingNode   63.2061069
		ArgOfPericenter -239.083969
		MeanAnomaly     277.557252
	}
}

