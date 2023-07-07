DwarfMoon	"Ignus I/Lercurnis B V I"
{
	ParentBody     "Ignus"
	Class          "Asteroid"
	Mass            1.4106e-09
	Radius          8
	InertiaMoment   0.39943
	Oblateness      0.0012508
	Obliquity       172
	EqAscendNode    -140.15
	TidalLocked     true

	AbsMagn         10.698
	SlopeParam      3.5321
	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_kond_ignus_i.cfg"
		SurfStyle       0.26377
		Randomize      (-0.748, 1.298, 0.412)
		colorDistMagn   0.74227
		colorDistFreq   0.030116
		detailScale     16
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.0017453
		icecapLatitude  2
		icecapHeight    0.52707
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.25706
		heightTempGrad  0.625
		beachWidth      0.0011397
		tropicWidth     0.07
		mainFreq        0.72393
		venusFreq       0.71756
		venusMagn       0.38168
		mareDensity     0
		terraceProb     0.15923
		erosion         0
		montesMagn      1
		montesFreq      3
		montesSpiky     1
		montesFraction  1
		dunesFraction   0
		hillsMagn       5
		hillsFreq       1
		hillsFraction   1
		hills2Fraction  1
		eqridgeMagn     0.28244
		eqridgeWidth    1
		eqridgeModMagn  1.5267
		eqridgeModFreq  0.8
		canyonsFraction 0
		craterMagn      0.1
		craterFreq      1
		craterDensity   1
		craterOctaves   30
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55502
		volcanoTemp     280.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      7.8186
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

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   1.5762e-05
		GasToDust   0
		Particles   10000
		GasBright   0.001
		DustBright  0.001
		GasColor   (0.000 0.000 0.000)
		DustColor  (0.016 0.023 0.031)
	}

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      2.19145314
		SemiMajorAxisKm 146579.846
		Eccentricity    0.05
		Inclination     172
		AscendingNode   -140.152672
		ArgOfPericenter 57.7099237
		MeanAnomaly     2.7480916
	}
}

